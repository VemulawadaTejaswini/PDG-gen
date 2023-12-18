import java.util.Scanner;

public class main{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x=sc.nextInt();
	int[]v=new int[n];
	for(int i=0;i<n;i++)
		v[i]=sc.nextInt();
	int ans=0;
	int sum=0;
	for(int i=0;i<n;i++){
		sum += v[i];
		if(sum <= x){
			++ans;
		}
	}
	System.out.println(ans);
	sc.close();
}
}