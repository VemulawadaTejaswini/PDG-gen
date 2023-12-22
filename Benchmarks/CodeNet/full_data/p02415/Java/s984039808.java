import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			String str = scan.nextLine();
			System.out.println(str.toLowerCase());
		}finally{
			if(scan !=null)scan.close();
		}
	}
}