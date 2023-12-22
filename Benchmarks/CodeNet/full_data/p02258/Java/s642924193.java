import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		int n,i,j,a,min,ans;
		Scanner sc=new Scanner(System.in);
		n=Integer.parseInt(sc.next());
		int r[]=new int[n];
		for(i=0;i<n;i++){
			r[i]=Integer.parseInt(sc.next());
		}
		ans=r[1]-r[0];

		for(i=1;i<n;i++){
			for(j=i+1;j<n-1;j++){
				if(r[j]-r[i]>ans){
					ans=r[j]-r[i];
				}
			}
		}
		System.out.println(ans);


	}

}