import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		String[] c = new String[N];
		int[] a = new int[N];
		int[] b = new int[N];
		int max = 0;
		int min = N;
		for(int i=0;i<N;i++){
			a[i]=scanner.nextInt();
			b[i]=scanner.nextInt();
			c[i]=scanner.next();
		}
		for(int w=0;w<K;w++){
			for(int h=0;h<K;h++){
				int pos = 0;
				for(int j=0;j<N;j++){
					if("B".equals(c[j])){
						if((((a[j]+w)/K)+(b[j]+h)/K)%2==0){
							pos++;
						}
					}
					else{
						if((((a[j]+w)/K)+(b[j]+h)/K)%2!=0){
							pos++;
						}
					}
				}
				if(max<pos){
					max = pos;
				}
				if(min>pos){
					min = pos;
				}
				if(max==N){
					break;
				}
				if(min==0){
					break;
				}

			}
		}
		if(max<N-min){
			max = N - min;
		}
		System.out.println(max);
	}

}