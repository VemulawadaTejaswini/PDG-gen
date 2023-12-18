import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int ans = 0;      
        for(char c = 'a'; c<='z'; c++){
            int cnt = 0;
            for(int i=0; i<n; i++){
                
                if(s[i]==c){
                    cnt++;
                }
                if(cnt==2){
                    ans++;
                    cnt++;
                }
            }
        }
        System.out.println(ans);
        
    }
}
