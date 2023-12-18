public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        ArrayList<Integer> cordinates = new ArrayList<>();


        if(M==1){
            System.out.println(0);
            return;
        }

        for(int i=0; i<M; i++){
            int tmp = scanner.nextInt();
            cordinates.add(tmp);
        }

        Collections.sort(cordinates);

        ArrayList<Integer> distances = new ArrayList<>();

        long acc = 0;

        for(int i=0; i<cordinates.size()-1; i++){
            int diff = cordinates.get(i+1) - cordinates.get(i);
            acc += diff;
            distances.add(diff);
        }

        Collections.sort(distances, Collections.reverseOrder());

        for(int i=0; i < Math.min(N-1, M); i++){
            acc -= distances.get(i);
        }

        System.out.println(acc);



    }
}
