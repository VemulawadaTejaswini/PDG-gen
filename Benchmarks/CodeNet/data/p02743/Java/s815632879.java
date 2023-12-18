import java.util.*;

public class Main {
	public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    double aw = Math.sqrt(a);
    double bw =Math.sqrt(b);
    double cw = Math.sqrt(c);

    if (aw+bw<cw){
    System.out.println("Yes");

    }else{
    System.out.println("No");

    }
}

}

