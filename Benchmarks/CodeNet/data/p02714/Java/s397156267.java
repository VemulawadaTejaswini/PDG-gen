import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	String ss = sc.next();
      	char[] s = ss.toCharArray();
      	long ans = 0;
      	for(int i = 0; i < n-2 ; i++){
        	for(int j = i+1 ; j < n-1 ; j++){
              	if(s[i]==s[j]) continue;
              	for(int k = j+1 ; k < n ; k++){
                 	if(s[j]!=s[k] && s[k]!=s[i]  && j-i != k-j) ans++;
                }
            }
        }
      	System.out.println(ans);
    }
}