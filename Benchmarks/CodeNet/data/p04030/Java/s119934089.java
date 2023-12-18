import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
        char[] s = new char[S.length()];
        for(int i=0; i<S.length(); i++){
          s[i] = S.charAt(i);
        }
        
        String ans = "";
        for(int i=0; i<S.length(); i++){
          if(s[i] == '0'){
            ans += 0;
          }else if(s[i] == '1'){
            ans += 1;
          }else{
            if(ans.length()>0){
              ans = ans.substring(0, ans.length()-1);
            }
          }
          if(i==S.length()-1){
            System.out.println(ans);
          }
        }
    }
}