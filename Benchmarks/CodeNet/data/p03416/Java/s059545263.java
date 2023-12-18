import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        for(int i = a;i <= b;i++) {
        	String is = String.valueOf(i);

        	boolean flag = true;
        	for(int j = 0;j < is.length()/2;j++) {
        		flag = flag && is.charAt(j) == is.charAt(is.length()-j-1);
        	}

        	sum += flag ? 1 : 0;
        }

        System.out.println(sum);
    }
}
