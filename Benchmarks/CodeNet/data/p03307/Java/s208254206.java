import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        sc.close();

        //Nが奇数か偶数かで条件分岐
        if(N % 2 == 1) {
        	System.out.println(N * 2);
        }else {
        	System.out.println(N);
        }
	}
}