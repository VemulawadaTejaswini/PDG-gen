import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	static int MAX=10000001;
	static boolean[] is=new boolean[MAX];
	static{
		Arrays.fill(is,true);
		is[0]=is[1]=false;
		for(int i=2;i*i<=is.length;i++){
			if(is[i]){
				for(int j=i+i;j<is.length;j+=i){
					is[j]=false;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int n=cin.nextInt();
			if(n==0)break;
			if(n%2==0)n--;
			for(int i=n;i>=13;i-=2){
				if(is[i]){
					if(is[i-2]&&is[i-6]&&is[i-8]){
						System.out.println(i);
						break;
					}
				}
			}

		}
	}

}