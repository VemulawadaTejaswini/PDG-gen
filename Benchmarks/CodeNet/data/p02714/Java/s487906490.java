import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
		String S = sc.next();
		char[] s = S.toCharArray();
      
        int r = 0;
        int g = 0;
        int b = 0;
        for(int i = 0; i < n; i++){
          if(s[i] == 'R'){
            r++;
          }else if(s[i] == 'G'){
            g++;
          }else{
            b++;
          }
        }
      
        long all = r*g*b;
        int ans = 0;
      
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++){
              if(s[i] == s[j]){
                continue;
              }
              
                int k = j*2-i;
                
              if(k >= n || s[k] == s[i] || s[k] == s[j]){
                  continue;
              }
                  ans++;
            }
		}
		
		System.out.println(all - ans);
	}
}