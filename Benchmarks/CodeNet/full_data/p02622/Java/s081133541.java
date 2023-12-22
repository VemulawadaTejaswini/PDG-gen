import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	
        //sec--1
        String S = sc.nextLine();
        String T = sc.nextLine();
        int cnt = 0;
      
        //sec--2
        for(int i=0; i<S.length(); i++) {
          //if(S[i].equals(T[i]){
          //} else {S[i] == T[i];
          
          //文字列のi番目が異なるときカウントする
          //文字列を書き換えるという必要はないのでカウントのみ
          if(S.charAt(i) != T.charAt(i)) {
            cnt++;
          }
        }
      	
        System.out.println(cnt);
   }
}
