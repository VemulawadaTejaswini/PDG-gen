import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
		int[] price = new int[N];
		for(int i=0; i<price.length; i++){
			price[i]=sc.nextInt();
		}
		int[] srt = new int[price.length];
		int cnt=0;
		int[] sort = new int[price.length];
		for(int i=0; i<price.length; i++){
			for(int j=0; j<price.length; j++){
				if(price[i]>price[j]){
					cnt+=1;
					srt[i]=cnt;
				}
			}
			cnt=0;
			sort[i]=price[srt[i]];
		}
		int sum=0;
		int[] result = new int[price.length];
		for(int k=1; k<=price.length; k++){
			for(int i=0; i<k; i++){
				sum+=price[srt[N-1-i]];
			}
			result[k-1]=sum;
			sum=0;
		}
		int[] cal = new int[price.length];
		for(int i=0; i<price.length; i++){
			cal[i]=(result[i]+C)/(A+((i+1)*B));
		}
		int max = cal[0];
		for(int i=0; i<price.length; i++){
			if(max<cal[i]){
					max=cal[i];
			}
		}
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}