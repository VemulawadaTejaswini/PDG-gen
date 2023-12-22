import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c,n,i,temp,x,y;
		n=s.nextInt();
		for(i=0;i<n;i++){
			a=s.nextInt();
			b=s.nextInt();
			if(b>a){
				temp=a;
				a=b;
				b=temp;
			}
			c=s.nextInt();
			if(c>a){
				temp=a;
				a=c;
				c=temp;
			}
			x=a*a;y=b*b+c*c;
			if(x!=y)
				System.out.println("NO");
			else
				System.out.println("YES");
		}

	}

}