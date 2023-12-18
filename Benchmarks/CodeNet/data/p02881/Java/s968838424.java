import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      	int x = 2;
        int y;
        int sum;
        while(N % x == 0){
          x++;
        }
      	y = N / x;
        sum = (x-1)+(y-1);
		 System.out.println(sum);            
    }
}