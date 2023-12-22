import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	if(N % 1000 == 0) {
        	System.out.println(0);  
        } else {
         	int quo = N / 1000;
          	int total = 1000 * (quo + 1);
          	int rem = total - N;
	        System.out.println(rem);
        }
	}
}