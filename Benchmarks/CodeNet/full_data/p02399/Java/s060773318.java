import java.util.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print(num1 / num2+" ");
        System.out.print(num1 % num2+" ");
        System.out.println(String.format("%.5f",(double)num1 / num2));
    }
}
