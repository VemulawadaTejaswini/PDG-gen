import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
	int D = sc.nextInt();
	int x2000 = sc.nextInt();
	int rr = x2000;
	for(int i=2001;i<=2010;i++){
	    rr = r * rr - D;
	    if(i!=2010) System.out.println(rr);
	    else System.out.print(rr);
	}
    }
}
