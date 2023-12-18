import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long n = sc.nextInt();
    long k = sc.nextInt();
    long min = n % k;
      if(min > k - min)
        min = k - min;	
	System.out.println(min);
	}
}