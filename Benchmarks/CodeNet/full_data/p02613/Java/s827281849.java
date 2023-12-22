import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int AC=0,WA=0,TLE=0,RE=0;
      for(int i=1;i<N+2;i++){
      	String S = sc.nextLine();
        if(S.equals("AC")){
        	AC++;
          	continue;
        }else if(S.equals("WA")){
        	WA++;
          continue;
        }else if(S.equals("TLE")){
        	TLE++;
          continue;
        }else if(S.equals("RE")){
        	RE++;
          continue;
        }
      }
      System.out.println("AC x "+AC);
      System.out.println("WA x "+WA);
      System.out.println("TLE x "+TLE);
      System.out.println("RE x "+RE);
    }
}