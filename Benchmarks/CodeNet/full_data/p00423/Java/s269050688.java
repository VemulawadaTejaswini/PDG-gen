import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		while((n=scanner.nextInt())>0){
			int a=0,b=0;
			for(int i=0;i<n;i++){
				int aa=scanner.nextInt(),bb=scanner.nextInt();
				if(aa>bb)a+=aa+bb;
				else if(aa<bb)b+=aa+bb;
				else {a+=aa;b+=bb;}
			}
			System.out.println(a + " "+b);
		}
	}
}