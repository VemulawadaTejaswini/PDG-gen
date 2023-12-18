public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int A = 0;
        int N = 0;
        int[] X ;
        int result = 0;
        N = scanner.nextInt();
        A = scanner.nextInt();
        X = new int[N];
        int pointer = 0;
        int way = 0;
        for (int i = 0; i < N; i++){
            X[i] = scanner.nextInt();
        }
        for(int i = 0; i < N ; i++ ){
            int sum = 0;
        
            for(int j = 0; j < pointer; j++){
                sum += X[j];
            }
            for(int k = 0; k < N; k++){
                if ( ((float)(sum + X[k])/(i+1)) == A){
                way++;
            }
            }
            pointer ++;
            if(pointer >= 50){
                break;
            }
        }
        System.out.print(way);
    }
}