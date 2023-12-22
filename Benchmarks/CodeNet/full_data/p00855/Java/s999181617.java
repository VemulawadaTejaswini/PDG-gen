import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		boolean[] is=new boolean[1299710];
		Arrays.fill(is, true);
		is[0]=is[1]=false;
		for(int i=2;i*i<is.length;i++){
			if(is[i]){
				for(int j=i+i;j<is.length;j+=i){
					is[j]=false;
				}
			}
		}
		for(int i=0;i<100;i++){
//			System.out.println(i+" "+is[i]);
		}
		while(true){
			int n=cin.nextInt();
			if(n==0)break;
			if(is[n]){
				System.out.println(0);
				continue;
			}
			int res=1;
			for(int i=n+1;i<is.length;i++){
				if(!is[i]){
					res++;
				}
				else{
					break;
				}
			}
			for(int i=n-1;i>=0;i--){
				if(!is[i]){
					res++;
				}
				else{
					break;
				}
			}
			System.out.println(res+1);
		}

	}

}