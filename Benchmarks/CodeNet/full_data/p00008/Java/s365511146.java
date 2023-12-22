
import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			int sum=sc.nextInt();
			int res=0;
			for(int a=0;a<10;a++)
				for(int b=0;b<10;b++)
					for(int c=0;c<10;c++)
						for(int d=0;d<10;d++)
							if(a+b+c+d==sum){
								res++;
							}
			ln(res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}