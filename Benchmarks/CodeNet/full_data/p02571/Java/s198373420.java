import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        
        int tmp = 0;
        int max = 0;
        for(int i = T.length(); i >= 0; i--){
          if(S.contains(T.substring(0,i))){
            tmp = i;
          }
          if(max < tmp){
            max = tmp;
          }
        }
        
        if(max == 0){
          for(int i = 0; i < t.length; i++){
            for(int j = 0; j < s.length; j++){
              if(t[i] == s[j] && i <= j && t.length-i <= s.length-j){
                max = 1;
              }
            }
          }
        }
        System.out.println(T.length()-max);
     
	}
}