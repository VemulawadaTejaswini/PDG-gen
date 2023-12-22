package 排序;
//插入排序
import java.util.Scanner;
class A {
	public static void main(String[] args)throws Exception{
		Scanner cin=new Scanner(System.in);
		int N,i,j,k,v;
		N=cin.nextInt();
		int [] arr=new int[105];
		for(i=0;i<N;i++){
			arr[i]=cin.nextInt();
		}
		for(i=0;i<N;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for( i=1;i<N;i++){
			v=arr[i];
			for(j=i-1;j>=0;j--){
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
			System.out.println();
		}
		cin.close();
	}
}

