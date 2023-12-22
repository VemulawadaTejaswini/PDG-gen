import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);
	
	int n;
	public void run() {
		int n=sc.nextInt();
		while(n--!=0){
			int a1=0,a2=0;
			boolean ok=true;
			for(int i=0;i<10;i++){
				int ball=sc.nextInt();
				if(Math.max(a1,a2)<ball){
					if(a1>a2){
						a1=ball;
					}else{
						a2=ball;
					}
				}else if(a1<ball){
					a1=ball;
				}else if(a2<ball){
					a2=ball;
				}else{
					ok=false;
					break;
				}
			}
			ln(ok?"YES":"NO");
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