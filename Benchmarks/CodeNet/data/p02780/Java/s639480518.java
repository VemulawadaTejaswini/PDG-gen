import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= Integer.parseInt(sc.next()),k=Integer.parseInt(sc.next());
		double[] e=new double[n];
		double[] res=new double[n];
		double flag=0,sum=0,max=0,buff;
		int count=0;
		for(int i=0;i<n;i++) {
			buff=Integer.parseInt(sc.next());
			e[i]=(0.5*buff*(buff+1))/buff;
			sum+=e[i];
			if(i>=k) {
				sum-=e[count];
				count++;
			}
			max=Math.max(max, sum);
			//System.out.println(sum);
		}
		System.out.println(max);
	}

}
