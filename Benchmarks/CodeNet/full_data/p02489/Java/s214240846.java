import java.util.Scanner;

public class Main{
public static void main(String[] args){
	int x,n=1;
	Scanner sc = new Scanner(System.in);
	x=sc.nextInt();
	while(x!=0){
		System.out.printf("Case %d: %d\n",n,x);
		n++;
		x=sc.nextInt();
	}

}
}