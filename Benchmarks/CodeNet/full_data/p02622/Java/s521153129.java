import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	
        //sec--1
        String S = sc.nextLine();
        String T = sc.nextLine();
        S.length <= 2*100000;
        T.length <= 2*100000;
        S.length = T.length;
        int cnt = 0;
      
        //sec--2
        for(int i=0; i<S.length; i++) {
          if(S[i].equals(T[i]){
            break;
          } else {
            S[i] == T[i];
            cnt++;
          }
        }
      	
        System.out.println(cnt);
   }
}