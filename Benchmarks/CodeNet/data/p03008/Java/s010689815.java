import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[3];
		int[] b=new int[3];
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		b[0]=sc.nextInt();
		b[1]=sc.nextInt();
		b[2]=sc.nextInt();
		int ans=n;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(j==i){
					continue;
				}
				int sum=n;
				int temp=Math.max(a[i],b[i])*(sum/Math.min(a[i],b[i]));
				sum=sum%Math.min(a[i],b[i]);
				temp+=Math.max(a[j],b[j])*(sum/Math.min(a[j],b[j]));
				sum=sum%Math.min(a[j],b[j]);
				if(i==0 && j==1){
					temp+=Math.max(a[2],b[2])*(sum/Math.min(a[2],b[2]));
				}else if(i==0 && j==2){
					temp+=Math.max(a[1],b[1])*(sum/Math.min(a[1],b[1]));
				}else{
					temp+=Math.max(a[0],b[0])*(sum/Math.min(a[0],b[0]));
				}
				ans=Math.max(ans,temp);
			}
		}
		System.out.println(ans);
	}
}
