import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int X = sc.nextInt();
    	sc.close();
    	long ans = 0L;
    	ans = (X / 500) * 1000;
    	X = X % 500;
    	ans += (X / 5) * 5;
    	X = X % 5;
    	System.out.println(ans);
    }

}