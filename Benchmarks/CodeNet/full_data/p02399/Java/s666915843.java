import java.util.Scanner;

public class Main {
	public static void main(String[]args){
	Scanner sc =new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();


int x=a/b;
int y=a%b;
double f2;
f2=1.0*a/b;
System.out.println(x+" "+y+" "+String.format("%8f"));
sc.close();
	}
}

