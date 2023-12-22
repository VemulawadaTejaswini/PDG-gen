import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
			int n=scn.nextInt();
			long []arr =new long[n];
			for(int i=0;i<n;i++){
				arr[i]=scn.nextLong();
			}
			long max=0;
			long ans=0;
			for(int i=0;i<n;i++){
				if(arr[i]>max){
					max=arr[i];
				}else{
					ans+=(max-arr[i]);
				}
			}
		System.out.println(ans);

	}

}