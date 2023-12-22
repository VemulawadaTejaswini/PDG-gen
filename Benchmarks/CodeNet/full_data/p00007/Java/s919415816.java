import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		int n =  s.nextInt();
	  double sum = 10;
	  for(int i=0;i<=n;i++){
		  Math.ceil(sum*=1.05);
	  }
		int answer = (int)sum*10000;
		System.out.println(answer);
	}
}