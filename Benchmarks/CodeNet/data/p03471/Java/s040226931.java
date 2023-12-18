import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int y=sc.nextInt();
	int y10000 = -1;
	int y5000 = -1;
	int y1000 = -1;

	for(int i=0;i<=n;i++) {
		for(int j=0;j<=n;j++) {
			int k=n-i-j;
			if(y==10000*i+5000*j+1000*k) {
				y10000 = i;
				y5000 = j;
				y1000 = k;
				break;
			}
		}
	}
	System.out.println(y10000+" "+y5000+" "+y1000);
	}
}