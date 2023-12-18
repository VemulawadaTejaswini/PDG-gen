import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),k=scan.nextInt(),x,s=0,i;
		for(i=0;i<n;i++) {
			x=scan.nextInt();
			if(x*2>(k-x)*2) s+=(k-x)*2;
			else s+=x*2;
		}
		System.out.print(s);
	}
}