import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		double z=(n+m)/2.00;
		int z1=(int)z;
		int z2=n+m;
		if (z2%2!=0) {
			if (z1%2==1) {
				z1+=1;
			}
		}
		System.out.println(z1);
	}
}