import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int max=3500;
		int end=0;
		for(int i=1;end==0&&i<=max;i++){
			for(int j=i;end==0&&j<=max;j++){
				for(int k=j;k<=max;k++){
					if(4*i*j*k==n*(i*j+j*k+k*i)){
						System.out.println(i+" "+j+" "+k);
						end=1;
						break;
					}
				}
			}
		}
	}
}