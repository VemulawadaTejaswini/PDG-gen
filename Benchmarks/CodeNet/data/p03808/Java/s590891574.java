public class Main {

	public static void main(String[] args) {

		int N=0;

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		N=scanner.nextInt();
		//System.out.printf("N=%d", N);
		int A[]=new int[N+1];
		
		for(int i=1;i<=N;i++){
			A[i]=0;
			A[i]=scanner.nextInt();
			//System.out.printf("%D", A[i]);
		}
		
		int result=hantei(A,N);
		while(result>0){
			int min=(int)Math.pow(10.0, 9.0);
			int min_num=0;
			for(int i=1;i<=N;i++){
				if(min>=A[i]){
					min=A[i];
					min_num=i;
				}
			}
			for(int i=0;i<N;i++){
				int a=(min_num+i)%N;
				if(a==0){
					a=N;
				}
				A[a]-=(i+1);
			}
			result=hantei(A,N);
		}
		if(result==-1){
			System.out.println("NO");
		}else if(result==0){
			System.out.println("YES");
		}
		
		

	}
	public static int hantei(int a[],int N){
		int result=0;//終わりなら、0.マイナスになったら-1,まだできるなら1を返す。
		int sum=0;
		/*for(int i=1;i<=N;i++){
			System.out.printf("a[%d]=%d\n\r", i,a[i]);
		}*/
		for(int i=1;i<=N;i++){
			if(a[i]<0){
				
				result=-1;
				break;
			}else{
				sum+=a[i];
			}
		}
		if(sum>0&&result>=0){
			result=1;
		}else if(sum==0&&result>=0){
			result=0;
		}
		
		return result;
	}

}