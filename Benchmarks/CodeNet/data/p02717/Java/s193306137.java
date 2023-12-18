import java.util.Scanner;
class ABCSwap{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	
	int a=stdIn.nextInt();
    int b=stdIn.nextInt();
    int c=stdIn.nextInt();
    int t=a;
    a=b;
    b=t;
    int tem=a;
    a=c;
    c=tem;
    System.out.print(a);
    System.out.print(b);
    System.out.print(c);
    }
}