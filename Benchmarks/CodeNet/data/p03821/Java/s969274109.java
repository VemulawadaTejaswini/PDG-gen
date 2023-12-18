import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n=as.nextInt();
		long[] a;
		int[] b;
		a = new long[n];
		b = new int[n];
		for(int i=0;i<n;i++){
			a[i] = Long.parseLong(as.next());
			b[i] = Integer.parseInt(as.next()); 
		}
		long l = 0;
		try{
			for(int i=n-1;i>=0;i--){
				if(a[i]%b[i]!=0){
					a[i]++;
					l++;
					i++;
				}else{
					a[i-1]+=l;
				}
			}
		}catch(Exception e){
			
		}
		System.out.println(l);
	}
}