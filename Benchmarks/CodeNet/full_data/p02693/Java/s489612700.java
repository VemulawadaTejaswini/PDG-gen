import java.util.Scanner;
class sample{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      	int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=a;
      int n=1;
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