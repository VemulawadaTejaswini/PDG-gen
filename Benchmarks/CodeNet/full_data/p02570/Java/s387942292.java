import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		
		int D= sc.nextInt();
		int T= sc.nextInt();
		int S= sc.nextInt();
		
		sc.close();
		
		if(T*S >= D)System.out.println("Yes");
		else System.out.println("No");

	}

}