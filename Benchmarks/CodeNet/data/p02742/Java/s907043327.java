import java.util.*;

public class Main {
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextLong();
	double ans = a*b/2.0;
    System.out.println(Math.round(ans+0.5));

    }


}

