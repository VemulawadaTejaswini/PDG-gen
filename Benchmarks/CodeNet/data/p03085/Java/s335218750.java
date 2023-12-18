import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char s;
    int count =0,ans = 0;
    for(int i = 0;i<S.length();i++){
      	s=charAt(i);
      	if(s=='A'||s=='T'||s=='G'||s=='C'){
			count++;
        }else{
			ans = Math.max(count,ans);
          	count = 0;
        }
    }
    
    ans = Math.max(count,ans);
    System.out.println(ans);
  }
}