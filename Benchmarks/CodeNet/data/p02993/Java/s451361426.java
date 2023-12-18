import java.util.Scanner;

public class Main{
  public static void main(String[] args){

	    Scanner sc = new Scanner(System.in);  //標準入力の宣言
      	String S = sc.next(); //入力数
       
        String S1 = S.substring(0,1);
        String S2 = S.substring(1,2);
        String S3 = S.substring(2,3);
        String S4 = S.substring(3,4);
    
        String kekka = "Good";
        
        if (S1.equals(S2) || S2.equals(S3) || S3.equals(S4)) {
          kekka = "Bad";
        }

        System.out.println(kekka); //入力数の確認

  }
}
