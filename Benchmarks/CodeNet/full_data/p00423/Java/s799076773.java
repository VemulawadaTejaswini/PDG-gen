import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int n,ap,bp;
		while((n=sc.nextInt())!=0){
			ap=0; bp=0;
			for(int i=0;i<n;i++){
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(a>b)ap+=a+b;
				if(a<b)bp+=a+b;
				if(a==b)ap+=a; bp+=b;
			}
			System.out.println(ap+" "+bp);
		}
	}

}