import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int k=0,max,num=0;
		int[] A=new int[1000];
		int[] B=new int[1000];
		int[] count=new int[1000];
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<n;i++){
			A[i]=sc.nextInt();
		}
		for(int j=0;j<m;j++){
			B[j]=sc.nextInt();
		}
		for(int j=0;j<m;j++){
			if(B[j]>=A[k]){
				B[j]=k;
				k=0;
			}else{
				k++;
				j-=1;
			}
		}
		max=count[0];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(B[j]==i){
					count[i]+=1;

				}
			}
			if(count[i]>max){
				max=count[i];
				k=i+1;
			}
			System.out.printf("%d\n",k );
		}

	}

}