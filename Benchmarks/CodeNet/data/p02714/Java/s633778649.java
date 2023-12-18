import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
		String S = sc.next();
		char[] s = S.toCharArray();
      
        int ans = 0;
      
		for(int i = 0; i < n-2; i++) {
			for(int j = i+1; j < n-1; j++){
              for(int k = j+1; k < n; k++){
                if(s[i]!=s[j] && s[j]!=s[k] && s[k]!=s[i] && (j-i)!=(k-j)){
                  ans++;
                }
              }
            }
		}
		
		System.out.println(ans);
	}
}