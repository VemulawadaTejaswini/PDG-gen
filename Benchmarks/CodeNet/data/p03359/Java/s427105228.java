import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	int ans = a;
      	if(a<b){
          ans = ans - 1;
        }
      	System.out.println(ans);
	}
}