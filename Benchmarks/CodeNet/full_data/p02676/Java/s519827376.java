import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
        sc.nextLine();
		String S= sc.nextLine();      
        if(S.length()<=K){
          System.out.println(S);
        }else {
          String Sf=S.substring(0,K);
          System.out.println(Sf+"...");  
        }
	}
  
      
}