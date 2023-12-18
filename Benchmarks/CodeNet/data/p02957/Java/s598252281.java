import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
      	int a1=a/2;
      	int b1=b/2;
      	int sum=a1+b1;
      	if (a==b) System.out.println(0);
        else if (Math.abs(a-sum) == Math.abs(b-sum)) System.out.println(sum);
      	else System.out.println("IMPOSSIBLE");
    }
}
