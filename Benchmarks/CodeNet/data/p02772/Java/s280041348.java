public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i=0;i<=N;i++){
            A[i]=scan.nextInt();
        }
        int flg = 0;
        for(int i=0;i<N;i++){
            if(A[i]%2 == 0){
                if(A[i]%3 == 0||A[i]%5 == 0){
                }
            }else{
                flg = 1;
                break;
            }
        }
        if(flg == 0){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
        
        
    }
}