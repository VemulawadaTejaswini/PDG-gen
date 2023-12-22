import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                String S = scan.next();
                String T = scan.next();
               
                int nagasa = T.length();
                
                int ans = 10000;
                
                for(int i=0; i<=S.length()-nagasa; i++){
                    int kotonaru = 0;
                    int cnt=0;
                    while(cnt<T.length()){
                        if(S.charAt(i+cnt)!=T.charAt(cnt)){
                            kotonaru++;
                        }
                        cnt++;
                    }
                
                    ans = Math.min(kotonaru, ans);
                }
                
                System.out.println(ans);
        }
}