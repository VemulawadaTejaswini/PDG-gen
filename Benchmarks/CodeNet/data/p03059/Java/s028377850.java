import java.util.*;

public class Main{
	public  static void main(String[] args){
    	Scanner Scan = new Scanner(System.in);
      	int A = Scan.nextInt();
      	int B = Scan.nextInt();
      	int T = Scan.nextInt();
      	int preans = (T + 0.5) / A;
      	int ans = B * preans;
      	System.out.print(ans);
      	Scan.close();
    }
}