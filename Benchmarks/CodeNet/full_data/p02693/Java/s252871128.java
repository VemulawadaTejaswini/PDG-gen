
public class sample{
	public static void main(String[] args) {
		int a =1,n=1,d=1;
		int b=11,c=11;
		 
		while(d<c) {
			d=a*n;
			n++;
			System.out.println(d);
			if(d>=b&&d<=c) {
				System.out.println("Ok");
				break;
			}
			else if(d>b&&!(d<c))
			{
				System.out.println("NG");
				break;
			}
		}
		
	}
}