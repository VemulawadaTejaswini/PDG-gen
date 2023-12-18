import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int M=sc.nextInt();

		int[] Id=new int[N];

		int s=sc.nextInt()-1;
		int l=sc.nextInt();

		for(int i=0;i<N;i++){
			if(i>=s && i<l){
				Id[i]=1;
			}else{
				Id[i]=0;
			}
		}

		for(int i=0;i<M-1;i++){

			int s1=sc.nextInt()-1;
			int l1=sc.nextInt();

			for(int j=s;j<l;j++){
				if( j<s1 || j>=l1 ){
					Id[j]=0;
				}
			}

		}

		int ans=0;

		for(int i=0;i<N;i++){
			if(Id[i]==1) ans++;
		}

		System.out.println(ans);
		sc.close();
	}

}
