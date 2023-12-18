import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double roop = Math.sqrt(N);
      	double i = 2;
      	int x = 2;
        int y;
      	int count = 0;
        int endX;
        int endY;
        int sum;
        while(i < roop){
          if(N % x == 0){
            y = N / x;
            if(x + y - 2 < count || count == 0){
              endX = x;
              endY = y;
            }
          }
          x += 1;
          i += 1;
        }
        sum = endX + endY - 2;
		 System.out.println(sum);            
    }
}