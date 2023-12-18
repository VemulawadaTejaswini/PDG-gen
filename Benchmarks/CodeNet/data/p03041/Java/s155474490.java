public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int N;
        int K;
        
        N = N - 1;
        
        String S[N];
        
        int count;
        String small;
        
        for(count=0 ; count == K ; count++){
            if(count == K-1){
                small= S[count];
                small = small.toUpperCase();
                S[count] = small;
            }
            break;
        }
        
        System.out.println(S);
        
    }
}