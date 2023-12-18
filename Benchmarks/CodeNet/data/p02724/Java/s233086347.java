import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
      
        int most = X / 500;
        int least = (X-most*500)/5;
      
        int ans = most*1000 + least*5;
        System.out.println(ans);
	}

}