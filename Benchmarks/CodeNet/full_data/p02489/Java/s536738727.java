import java.util.Scanner;

public class Main {
    public static void main(String args[]){
	Scanner in= new Scanner(System.in);
	short n;
	short i = 0;
	while (true){
		i += 1;
		n = in.nextShort();
		if (n == 0) break;
	        System.out.printf("Case %d: %d%n", i, n);
	} 
    }   
}