import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		int n = scan.nextInt();
		long[] data = new long[n];
		long max = 0;
		for(int i = 0 ; i < n ; i++){
			data[i]=scan.nextLong();
		}
		//long min = Long.MAX_VALUE;
		max=data[1]-data[0];
		for(int i = 0 ; i < n ; i ++){
			/*if (data[i]>max) {
                continue;
            }*/
			for(int j = n-1 ; j > i ; j --){
				if(max<(data[j]-data[i])){
					max= data[j]-data[i];
				}
				//System.out.println(data[i]-data[j]);
			}
		}
		System.out.println(max);
	}
}