import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean isPrimeNumber[] = new boolean[55555 + 1];
        Arrays.fill( isPrimeNumber, true );
        int root = (int)Math.ceil(Math.sqrt(55555));
        for(int i = 2; i < root; i++) {
            if( !isPrimeNumber[i] ) continue;
            int index = 2;
            while( i * index <= 55555 ) {
                isPrimeNumber[i*index] = false;
                index++;
            }
        }
        
        int cnt = N;
        StringBuilder ans = new StringBuilder();
        for(int i = 2; i <= 55555; i++ ) {
            if( isPrimeNumber[i] && i % 5 == 1 ){
                ans.append(i);
               
                if( --cnt == 0 ) {
                    break;
                } else {
                    ans.append(" ");
                }
            }
            

        }
        System.out.println(ans);
    }
}


