import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int ah = scan.nextInt();
		int aa = scan.nextInt();
		int bh = scan.nextInt();
		int ba = scan.nextInt();
		boolean flag = true;
		while(true){
		  bh -= aa;
		  if(bh <= 0){
			  flag = true;
			  break;
		  }
		  ah -= ba;
		  if(ah <= 0){
			  flag = false;
			  break;
		  }
		  		};
		if(flag == true){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
