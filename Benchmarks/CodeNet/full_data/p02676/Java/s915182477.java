import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
      	int K = scn.nextInt();
      	String s = scn.next();
      	if(s.length() <= K){
        	System.out.println(s);
        }else{
        	System.out.println(s.substring(0, K+1) + "...");
        }
	}
}