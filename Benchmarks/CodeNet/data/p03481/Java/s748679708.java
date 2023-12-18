import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x=sc.nextLong();
		long y=sc.nextLong();
		
		long n=y/x;
		int z=-1;
		for(int i=0;i<32;i++){
			if( (n&(1L<<i))==(1L<<i) ){
				z=i;
			}
		}
		System.out.println(z+1);
	}
}
