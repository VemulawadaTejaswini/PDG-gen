import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner  scan=new Scanner(System.in);
		int x=scan.nextInt();
		while(x!=0){
		for(int i=1; i<=10000; i++){
			 x=scan.nextInt();
			System.out.println("Case "+ i+": "+x);
		}
	}
	}
}

