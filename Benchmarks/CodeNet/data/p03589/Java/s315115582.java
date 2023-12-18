import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int nn=3*n/4;
		int max=3500;
		int end=0;
		for(int i=(nn==0)?1:nn;end==0&&i<=max;i++){
			for(int j=i;end==0&&j<=max;j++){
				int buf=i*j;
				for(int k=(j<=nn)?nn:j;k<=max;k++){
					if(4*buf*k==n*(buf+j*k+k*i)){
						System.out.println(i+" "+j+" "+k);
						end=1;
						break;
					}
				}
			}
		}
	}
}