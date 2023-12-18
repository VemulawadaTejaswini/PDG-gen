import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ans = -1;
		double ansA;
		double ansB;
		int A = sc.nextInt();
		int B = sc.nextInt();
		ansB = B * 10.0;
		ansA = A * 12.5;
      	System.out.println(ansAsub);
		if(ansA - ansB > 10.0 || ansA - ansB < -10.0){
			ans = -1;
		}else if(ansA > ansB){
			ans = (int)ansB;
		}else{
			ans = (int)ansA;
		}
		System.out.println(ans);
	}
}