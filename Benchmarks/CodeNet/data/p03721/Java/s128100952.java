public class Main{

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner (System.in);
		int N=scanner.nextInt() ;
		int K=scanner.nextInt() ;
		
		int a[]=new int[N+1];
		int b[]=new int[N+1];
		
		for(int i=1;i<=N;i++){
			a[i]=scanner.nextInt();
			b[i]=scanner.nextInt();
		}
		
		int sum=0;
		/*for(int i=1;i<N+1;i++){
			sum+=b[i];
		}*/
		
		//int array[]=new int[sum];
		
		int num=0;
		/*for(int i=1;i<=N;i++){
			for(int a_time=0;a_time<b[i];a_time++){
				array[num]=a[i];
				num+=1;
			}
		}*/
		//ここまでOK
		int min_k=0;
		int minn=-1;
		//int min=(int)Math.pow(10.0, 5.0);
		while(min_k<K){
			int min=(int)Math.pow(10.0, 6.0);
			for(int i=1;i<=N;i++){
				if(minn<a[i]&&a[i]<=min){
					min=a[i];
				}
			}
			//ここで最小値が求まる。
			for(int i=1;i<=N;i++){
				if(min==a[i]){
					min_k+=b[i];
					if(min_k>=K){
						System.out.println(min);
						break;
					}
					
				}
			}
			/*if(min_k>=K){
				System.out.println(min);
				break;
			}*/
			minn=min;
		}
		
	}

}