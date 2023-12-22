import java.util.Scanner;
public class p1_2{
    public static void main(String[] args){
	int a,b,rem;
	Scanner scan =new Scanner(System.in);
	a=scan.nextInt();
	b=scan.nextInt();
	rem=a%b;
        while(rem!=0){
	    a=b;
	    b=rem;
	    rem=a%b;
	}
	System.out.println(b);
    }
}
