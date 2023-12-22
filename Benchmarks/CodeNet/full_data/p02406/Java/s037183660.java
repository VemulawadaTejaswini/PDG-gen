import java.io.IOException;
import java.util.Scanner;
public class Main {
public static void main(String[] args) throws IOException {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int i=3;
System.out.print(" ");
do {
	if(i>a) {
		break;
	}
	System.out.print(i+" ");
	i=i+3;
}while(true);
scan.close();
	}
}