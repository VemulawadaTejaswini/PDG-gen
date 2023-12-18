import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }
        for (int i = 0; i < n-1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            nodes[a].addNeighbour(nodes[b]);
            nodes[b].addNeighbour(nodes[a]);
        }
        // покрасим в два цвета
        int color1 = 0;
        int color2 = 0;
        boolean firstColor = true;
        int lastOfGeneration = 0;
        ArrayList<Node> nodesToProcess = new ArrayList<>(n);
        nodesToProcess.add(nodes[0]);
        for (int i = 0; i < n; i++) {
            Node node = nodesToProcess.get(i);
            if(firstColor) color1++;
            else color2++;
            node.getNeighbours().forEach(neighbour->{
                neighbour.getNeighbours().remove(node);
            });
            nodesToProcess.addAll(node.getNeighbours());
            if(lastOfGeneration==i){
                firstColor=!firstColor;
                lastOfGeneration = nodesToProcess.size()-1;
            }
        }
        int[] sequence = new int[n];

        int x = n/3;
        if(Math.min(color1, color2)<=x){
            //те, что меньше - числа кратные 3
            firstColor = color1<=color2;
            int counter3 = 3;
            nodesToProcess.clear();
            lastOfGeneration = 0;
            nodesToProcess.add(nodes[0]);
            for (int i = 0; i < n; i++) {
                Node node = nodesToProcess.get(i);
                if(firstColor){
                    sequence[node.getA()]=counter3;
                    counter3+=3;
                }
                nodesToProcess.addAll(node.getNeighbours());
                if(lastOfGeneration==i){
                    firstColor=!firstColor;
                    lastOfGeneration = nodesToProcess.size()-1;
                }
            }
            int counter = 1;
            for (int i = 0; i < n; i++) {
                if(sequence[i]==0){
                    sequence[i]=counter;
                    counter++;
                    if(counter%3==0) counter++;
                }
            }
        }else{
            //одному цвету 3n+1, другому 3n+2
            //те, что меньше - числа кратные 3
            firstColor = color1<=color2;
            int counter1 = 1;
            int counter2 = 2;
            nodesToProcess.clear();
            lastOfGeneration = 0;
            nodesToProcess.add(nodes[0]);
            for (int i = 0; i < n; i++) {
                Node node = nodesToProcess.get(i);
                if(firstColor){
                    sequence[node.getA()]=counter1;
                    counter1+=3;
                }else{
                    sequence[node.getA()]=counter2;
                    counter2+=3;
                }
                nodesToProcess.addAll(node.getNeighbours());
                if(lastOfGeneration==i){
                    firstColor=!firstColor;
                    lastOfGeneration = nodesToProcess.size()-1;
                }
            }
            int counter = 3;
            for (int i = 0; i < n; i++) {
                if(sequence[i]==0 || sequence[i]>n){
                    sequence[i]=counter;
                    counter+=3;
                }
            }
        }
        System.out.print(sequence[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(" " + sequence[i]);
        }
    }

    public static class Node {
        private final int a;
        private final Collection<Node> neighbours;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return a == node.a;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a);
        }

        public int getA() {
            return a;
        }

        public Collection<Node> getNeighbours() {
            return neighbours;
        }

        public Node(int a) {
            this.a = a;
            this.neighbours = new HashSet<>();
        }

        public void addNeighbour(Node node) {
            neighbours.add(node);
        }
    }
}
