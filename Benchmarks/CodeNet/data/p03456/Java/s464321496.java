import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
		int b = sc.nextInt();
      	if(b < 10) a = a * 10 + b;
        else if(b < 100) a = a * 100 + b;
      	else a = a * 100 + b;
      	
        System.out.println(Math.sqrt(a) * Math.sqrt(a) == a ? "Yes" : "No");
    }
}
