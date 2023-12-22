import java.util.Scanner;
public class Main {
		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);
			int x = stdIn.nextInt();
			int a=0;
			while(a>1000){
				System.out.print("case"+ a +":"+ x);
				a++;
				if(x<=0){
					a=1000;
				}
			}
		}
	}
