import java.util.Scanner;

public class Main{
    
 
    public static void main(String[] args)  {
        new Main().solve();
    }

    void solve(){
        Scanner sc = new Scanner(System.in);
        int N,M;
        N = Integer.parseInt(sc.next());
        M = Integer.parseInt(sc.next());
        sc.close();

        int result;

        if(N==0){
            if(M==0){
                result = 0;
            }
            result = M*(M-1)/2;
        }
        else{
            result = N*(N-1)/2 + M*(M-1)/2;
        }
        
        System.out.println(result);

        

    }
}