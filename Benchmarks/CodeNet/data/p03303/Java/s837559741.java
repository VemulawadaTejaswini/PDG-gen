import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int w = scn.nextInt();
      	String[] list = s.split("");
      	String ans = null;
      	for(int i=0; i<s.length(); i+=w){
          ans = ans + list[i];
        }
      	System.out.println(ans);
	}
}
