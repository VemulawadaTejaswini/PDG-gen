import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		while(true){
			int r = sn.nextInt(), c = sn.nextInt();
			if(r+c == 0) break;
			System.out.println(r%2==1 && c%2 == 1? "no": "yes");
		}
	}
}