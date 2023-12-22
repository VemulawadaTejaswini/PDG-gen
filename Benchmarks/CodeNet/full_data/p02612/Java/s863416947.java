import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
       	double N = sc.nextInt();
      	int pay= 1000*(int)Math.ceil(N/1000.0);
        System.out.println(pay-N);
    }
}