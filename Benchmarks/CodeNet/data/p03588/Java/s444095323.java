import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int buf=0;
		int max=-1;
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt(),b=sc.nextInt();
			if(a>max){
				max=a;
				buf=a+b;
			}
		}
		System.out.println(buf);

	}

}