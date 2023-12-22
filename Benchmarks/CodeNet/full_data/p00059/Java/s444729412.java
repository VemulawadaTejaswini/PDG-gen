import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			double xa1 = cin.nextDouble();
			double ya1 = cin.nextDouble();
			double xa2 = cin.nextDouble();
			double ya2 = cin.nextDouble();
			double xb1 = cin.nextDouble();
			double yb1 = cin.nextDouble();
			double xb2 = cin.nextDouble();
			double yb2 = cin.nextDouble();
			if(xb1 <= xa1 && xa1 <= xb2 && yb1 <= ya1 && ya1 <= yb2 ){
				System.out.println("YES");
			}
			else if(xa1 <= xb1 && xb1 <= xa2 && ya1 <= yb1 && yb1 <= ya2){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}

	}

}