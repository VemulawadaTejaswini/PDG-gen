import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int a = stdin.nextInt();
	int b = stdin.nextInt();
	int c = stdin.nextInt();
	int i = a;
	int r = 0,s = 0;
	while(i<=b){
	    s = c%i;
	    boolean t = (s == 0);
	    if(t){r++;}
	    else{}
	    i++;
	}
	System.out.println(r);
    }
}