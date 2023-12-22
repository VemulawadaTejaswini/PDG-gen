import java.util.*;

//幾何
class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			int a1=sc.nextInt(),a2=sc.nextInt(),b1=sc.nextInt();
			int count=0;
			for(int i=1;i<=10;i++){
				if(a1+a2+i<=20){
					int card=1;
					if(a1==i)card--;
					if(a2==i)card--;
					if(b1==i)card--;
					count+=card;
				}
			}
			ln(count>=7*0.5?"YES":"NO");
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