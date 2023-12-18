import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long a=sc.nextInt();
			long b=sc.nextInt();
			if(a==0 || b==0 || a*b<0) System.out.println("Zero");
			else if(a>0 && b>0) System.out.println("Positive");
			else System.out.println((-b+a+1)%2==0 ? "Positive" : "Negative");
		}
	}
}