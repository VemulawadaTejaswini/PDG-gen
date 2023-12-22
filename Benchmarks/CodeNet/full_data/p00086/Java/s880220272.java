import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int[] edge=new int[103];
			while(true){
				int f=sc.nextInt(),t=sc.nextInt();
				if(f==0 && t==0) break;
				edge[f]++;
				edge[t]++;
			}
			boolean ok=true;
			for(int i=3;i<100;i++){
				if(edge[i]%2!=0)ok=false;
			}
			ln(ok?"OK":"NG");
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