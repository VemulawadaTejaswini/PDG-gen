import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		while(true){
			String x =in.next();
			String y =in.next();
			int i = Integer.parseInt(x);
			int j = Integer.parseInt(y);
			int q = i+j;
			int p=1;
			for(int a =0;q/10 !=0;a++){
				q = q/10;
				p += 1;
			}
			System.out.println(p);
		}
	}
}