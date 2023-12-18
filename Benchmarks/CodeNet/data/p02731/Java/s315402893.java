import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int L = sc.nextInt();
    	sc.close();
    	double ans = 0;
    	ans = Math.pow(L / 3, 3.0);
    	System.out.println(String.format("%.7f", ans));
    }

}