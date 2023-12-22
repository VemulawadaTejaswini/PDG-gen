import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      		int N = sc.nextInt();
      		int answer = 1000 - N;
      		while(answer < 0){
            	answer = N + 1000;
            }
      		System.out.println(N);
    }
}