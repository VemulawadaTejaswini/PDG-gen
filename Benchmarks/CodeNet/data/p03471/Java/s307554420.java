import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int maisu=sc.nextInt();
		long sum=sc.nextLong();
		long kei=0;
		for(int i=0; i<=maisu; i++) {
			for(int j=0; j<=maisu-i; j++) {
				for(int k=0; k<=maisu-i-j; k++) {
					kei=1000*i+5000*j+10000*k;
					if(kei==sum && i+j+k==maisu) {
						System.out.println(k+" "+j+" "+i);
						System.exit(0);
					}
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}