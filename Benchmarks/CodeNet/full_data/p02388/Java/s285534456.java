import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			System.out.printf("%d\n",(int)Math.pow(scan.nextInt(),3));

		}finally{
			if(scan !=null)scan.close();
		}

	}
}