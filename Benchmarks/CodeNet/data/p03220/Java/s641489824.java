import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//T−x×0.006
double min=999999;
		int t = sc.nextInt();
		int a = sc.nextInt();
int ans=0;
	double h[]=new double[n+1];

for(int i=1;i<=n;i++){
	h[i]=sc.nextFloat();

h[i]=t-h[i]*0.0006;
h[i]=Math.abs(a-h[i]);
if(min>h[i]){
	ans=i;
	min=h[i];
}
}
System.out.println(ans);
	}}