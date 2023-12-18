import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a,b=0,c=0,i;
		for(i=0;i<3;i++) {
			a=stdIn.nextInt();
			if(a==5) b++;
			else if(a==7) c++;
		}
		System.out.print(b==2&&c==1?"YES":"NO");
	}
}