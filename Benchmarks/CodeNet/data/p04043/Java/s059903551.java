import java.util.*;

public class Main {   
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if((a-5)*(b-5)*(c-7) == 0 || (a-5)*(b-7)*(c-5) == 0 || (a-7)*(b-5)*(c-5) == 0) {
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }

        sc.close();
    }
}
