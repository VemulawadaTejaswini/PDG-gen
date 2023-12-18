import java.util.*;
public class Main{
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int a[]=new int[N];
		long result[]=new long[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		//minをもとめる
		int max=-1;
		int[] array=new int[a.length];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
			array[i]=max;
		}
		
		result[0]=a[0];
		for(int i=1;i<N;i++){
			result[i]=0;

			if(array[i-1]<a[i]){
				int count=count(a,i+1,a[i]);
				result[i]=a[i]-array[i-1]+count;
				result[0]+=array[i-1]-count;
			}else{
				result[0]+=a[i];
			}
		}
		for(int i=0;i<N;i++){
			System.out.println(result[i]);
		}
		
	}

	static int count(int[] value,int limit,int a){
		int result=0;
		for(int i=limit;i<value.length;i++){
			if(a<=value[i]){
				result++;
			}
		}
		return result;
	}


}
