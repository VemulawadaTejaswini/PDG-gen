import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		String S = sc.nextLine();
        String T = sc.nextLine();
      int ans=0;
      for(int i=0;i<S.length();i++){
        char s=S.charAt(i);
        char t=T.charAt(i);
        if(s!=t){
          ans++;
        }
      }
      System.out.println(ans);
}
}