
public class sample{
	public static void main(String[] args) {
		long time = System.nanoTime();
		
		int a =1,n=1,d=1;
		int b=11,c=11;
		 
		while(d<c) {
			d=a*n;
			n++;
			System.out.println(d);
			if(d>=b&&d<=c) {
				System.out.println("OK");
				break;
			}
			else if(d>b&&!(d<c))
			{
				System.out.println("NG");
				break;
			}
		}
		
		long time1=System.nanoTime();
		System.out.println("\nTime taken for this program in NanoSeconds: "+(time1-time));
	}
}