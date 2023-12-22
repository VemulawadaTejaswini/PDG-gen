import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
       	int N = sc.nextInt();
      	int pay= (int)Math.ceil(N/1000);
        System.out.println(pay-N);
    }
}