import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan =new Scanner(System.in);
			int r = scan.nextInt();
			double S = Math.pow(r, 2) * Math.PI;
			double h = 2 * r* Math.PI;
			System.out.println(S+ " " + h);
		}finally{
			if(scan !=null)scan.close();
		}

	}
}