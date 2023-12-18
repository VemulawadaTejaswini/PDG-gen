import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] S = new int[N];
        S[0] = sc.nextInt();

        loop: for(int i=1; i<N; i++){
            S[i] = sc.nextInt();
            for(int j=0; j<i; j++){
                if(S[i]==S[j]){
                    System.out.println("NO");
                    break loop;
                }
                //else if(S[i]!=S[i-j]){
                  //  continue loop;
                //}
            }
            if(i==N-1){
                System.out.println("YES");
            }
            
        }
    }
}