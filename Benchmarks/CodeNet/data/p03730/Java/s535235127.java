import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt(),t=a,i;
		scan.close();
		for(i=1;i<b;i++) {
			if(t%b==c) break;
			t+=a;
		}
		if(i==b) System.out.print("NO");
		else System.out.print("YES");
	}
}