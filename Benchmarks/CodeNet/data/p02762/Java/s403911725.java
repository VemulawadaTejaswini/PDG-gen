import java.util.*;

class Main{

    class Node{
        List<Node> nodes  = new LinkedList<Node>();
        List<Node> block  = new LinkedList<Node>();

        void addNode(Node node){
            nodes.add(node);
        }

        void addblock(Node node){
            nodes.add(node);
        }
    }

    int search(Node node){
        LinkedList<Node> open = new LinkedList<Node>();
        Set<Node> close = new HashSet<Node>();

        open.add(node);

        while(!open.isEmpty()){
            Node n = open.getFirst();

            for(Node i : n.nodes){
                if(!close.contains(i)){
                    open.add(i);
                }
            }

            open.remove(n);
            close.add(n);
        }

        for(Node n : node.block){
            close.remove(n);
        }

        return close.size() - node.nodes.size() - 1;
    }

    Main(){
        Scanner SC = new Scanner(System.in);
        int N = Integer.parseInt(SC.next());
        int M = Integer.parseInt(SC.next());
        int K = Integer.parseInt(SC.next());

        Node[] nodes = new Node[N];
        for(int i=0;i<N;i++){
            nodes[i] = new Node();
        }

        for(int i=0;i<M;i++){
            int A = Integer.parseInt(SC.next())-1;
            int B = Integer.parseInt(SC.next())-1;

            nodes[A].nodes.add(nodes[B]);
            nodes[B].nodes.add(nodes[A]);
        }

        for(int i=0;i<K;i++){
            int C = Integer.parseInt(SC.next())-1;
            int D = Integer.parseInt(SC.next())-1;

            nodes[C].block.add(nodes[D]);
            nodes[D].block.add(nodes[C]);
        }

        System.out.print(search(nodes[0]));
        for(int i=1;i<N;i++){
            System.out.print(" " + search(nodes[i]));
        }
        System.out.println("");
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
