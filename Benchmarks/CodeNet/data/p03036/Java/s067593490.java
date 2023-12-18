import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int r = Integer.parseInt(spl[0]);
		int D =Integer.parseInt(spl[1]);
		int x2000 = Integer.parseInt(spl[2]);
		sc.close();
      
		int[] X = new int[10];
		int x = x2000;
		for(int i = 0;i < X.length;i++){
			X[i] = r * x - D;
			System.out.println(X[i]);
			x = X[i];
		}
	}
}