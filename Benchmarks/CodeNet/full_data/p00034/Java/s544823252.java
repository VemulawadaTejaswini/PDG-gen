import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	int n;
	public void run() {
		while(sc.hasNext()){
			String str=sc.next();
			String[] strs=str.split(",");
			int[] dists=new int[10];


			int sum=0;
			for(int i=0;i<10;i++){
				dists[i]=Integer.parseInt(strs[i]);
				sum+=dists[i];
			}

			int v1=Integer.parseInt(strs[10]);
			int v2=Integer.parseInt(strs[11]);
			double pos=(double)sum*v1/(v1+v2);

			int res=0;
			for(int i=0;i<dists.length;i++){
				pos-=dists[i];
				if(pos<=0){
					res=i;
					break;
				}
			}
			ln((res+1));
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