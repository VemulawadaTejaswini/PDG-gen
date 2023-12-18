import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //T時間勉強する必要がある
        int X = sc.nextInt(); //X倍になる
        double A = (double)T / X; //世界Aで何時間進んだか



        System.out.println(String.format("%.4f",A));
	}

}