import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);
		String[] str1 = br.readLine().split(" "); 
		int count = 0;
		int[] a = new int[N+1];
		for(int i=1;i<=N;i++){
			a[i] = Integer.parseInt(str1[i-1]);
		}
		for(int i=1;i<N;i++){
			if(a[i]+a[i+1]>x){
				count += ((a[i]+a[i+1])-x);
				if(i==1){
					if(a[i+1]>=((a[i]+a[i+1])-x)){
						a[i+1] -= ((a[i]+a[i+1])-x);
					}else{
						a[i] -= ((a[i]+a[i+1])-x)-a[i+1];
						a[i+1] = 0;
					}
				}if(i==N-1){
					if(a[i]>=((a[i]+a[i+1])-x)){
						a[i] -= ((a[i]+a[i+1])-x);
					}else{
						a[i+1] -= ((a[i]+a[i+1])-x)-a[i];
						a[i] = 0;
					}
				}else{
					if(a[i]>a[i+1]){
						if(a[i]>=((a[i]+a[i+1])-x)){
							a[i] -= ((a[i]+a[i+1])-x);
						}else{
							a[i+1] -= ((a[i]+a[i+1])-x)-a[i];
							a[i] = 0;
						}
					}else{
						if(a[i+1]>=((a[i]+a[i+1])-x)){
							a[i+1] -= ((a[i]+a[i+1])-x);
						}else{
							a[i] -= ((a[i]+a[i+1])-x)-a[i+1];
							a[i+1] = 0;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}