import java.util.Scanner;

public class Main {
    public static void main(String args[]){
	Scanner in= new Scanner(System.in);
	short a = 0;
	short b = 0;
	short c = 0;
	while (true){
		a = in.nextShort();
		b = in.nextShort();
		if (a == 0 && b == 0){
			break;
		}else if (a > b){
			c = a;
			a = b;
			b = c;
		}
	        System.out.printf("%d %d%n", a, b);
	} 
    }   
}