import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
                String[] S = new String[N+1];
                String[] K = new String[N+1];
                int ans = 1;
                 
                
                for(int i=1; i<=N; i++){
                    S[i] = scan.next();
                }
                        K[1] = S[1];
                if(N>=2){
               for(int i=2; i<=N; i++){
                    for(int j=0; j<=ans; j++){
                        if(!(S[i].equals(K[j]))){
                           K[ans] = S[i];
                           ans++;
                        }
                    }
                }
                }
                System.out.println(ans);              
	}
}