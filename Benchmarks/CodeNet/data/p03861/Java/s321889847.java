import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		long a=stdIn.nextLong();
		long b=stdIn.nextLong();
		long x=stdIn.nextLong();
		int count=0;
		for(int i=0;i<=(b/x);i++){
			if((x*i<=b)&&(a<=x*i))
			count++;
		}
		System.out.print(count);
	}
}