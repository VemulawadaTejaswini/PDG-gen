public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n=sc.nextInt()-1;
			int h=sc.nextInt();
			int mc = 0;
			int mf = 0;

			while(n-->0){
				int nh = sc.nextInt();
				if(nh-h>mc)mc=nh-h;
				if(h-nh>mf)mf=h-nh;
				h=nh;
			}
			System.out.println(mc+" "+mf);
		}
	}
}