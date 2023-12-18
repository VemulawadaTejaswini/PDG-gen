import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int chiten=sc.nextInt();
		int[] zahyo=new int[chiten+2];
		zahyo[0]=0;
		zahyo[chiten+1]=0;
		for(int i=1; i<=chiten; i++) {
			zahyo[i]=sc.nextInt();
		}
		int tmp=0;
		long souwa=0l;
		for(int i=1; i<=chiten; i++) {
			tmp=zahyo[i];
			zahyo[i]=zahyo[i-1];
			for(int j=1; j<=chiten+1; j++) {
				souwa+=Math.abs(zahyo[j-1]-zahyo[j]);
			}
			zahyo[i]=tmp;
			System.out.println(souwa);
			souwa=0l;
		}
	}
}