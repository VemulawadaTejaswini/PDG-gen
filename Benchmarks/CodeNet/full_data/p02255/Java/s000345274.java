package 排序;
//插入排序
import java.util.Scanner;
 class A {
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int N,i,j,k;
		N=cin.nextInt();
		int [] arr=new int[1005];
		for(i=0;i<N;i++){
			arr[i]=cin.nextInt();
		}
		for(i=0;i<N;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		for( i=1;i<N;i++){
			int v=arr[i];
			for( j=i-1;j>=0;j--){
				if(arr[j]>v)
					arr[j+1]=arr[j];
				else{
					break;
				}
			}
			arr[j+1]=v;
			//System.out.println(v);
			for(k=0;k<N;k++)
				System.out.print(arr[k]+" ");
			System.out.print("\n");
		}
	}
}

