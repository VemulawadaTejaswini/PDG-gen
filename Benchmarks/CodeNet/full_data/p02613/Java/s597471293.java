import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int AC=0,WA=0,TLE=0,RE=0;
      for(int i=1;i<N+2;i++){
      	String S = sc.nextLine();
        if(S.equals("AC")){
        	AC++;
        }else if(S.equals("WA")){
        	WA++;
        }else if(S.equals("TLE")){
        	TLE++;
        }else if(S.equals("RE")){
        	RE++;
        }
      }
      System.out.println("AC × "+AC);
      System.out.println("WA × "+WA);
      System.out.println("TLE × "+TLE);
      System.out.println("RE × "+RE);
    }
}