import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int tA = scan.nextInt();
		int tB = scan.nextInt();
		int aC = scan.nextInt();
		int aD = scan.nextInt();
		String ans = "Yes";
		
		while(tA>0 && aC>0){
          //高橋君の攻撃
          aC = aC - tB;
          if(aC <= 0){
            ans="Yes";
            break;
          }

          //青木君の攻撃
          tA = tA - aD;
          if(tA <= 0){
            ans = "No";
            break;
          }
        }
      
        //回答表示
        System.out.println(ans);
    }
}