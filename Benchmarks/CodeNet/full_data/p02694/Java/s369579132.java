import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
        long X = Long.parseLong(x);
        long sum = 100;
        for(int i = 1; i <= 4000; i++){
          sum = sum + (long)(sum * 0.01);
          if(sum >= X){
            System.out.println(i);
            break;
          }
        }  
    }
}