import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int k,l;
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a<b && b<c){
			
		}else if(a<b && b>c && a<c){
			k=c;
			c=b;
			b=k;
		}else if(a<b && b>c && a>c){
			k=c;
			c=b;
			l=a;
			a=k;
			b=l;
		}else if(a>b && b>c){
			k=c;
			c=a;
			a=k;
		}else if(a>b && b<c && a<c){
			k=a;
			a=b;
			b=k;
		}else{
			k=c;
			c=a;
			b=k;
		}
		System.out.printf("%d %d %d\n",a,b,c);
	}
}