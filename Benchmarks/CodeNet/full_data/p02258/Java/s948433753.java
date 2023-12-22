import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		int n = scan.nextInt();
		long[] data = new long[n];
		long max = 0;
		for(int i = 0 ; i < n ; i++){
			data[i]=scan.nextLong();
		}
		long min = Long.MAX_VALUE;
		for(int i = 0 ; i < n ; i ++){
			if (data[i]>min) {
                continue;
            }
			for(int j = i+1 ; j < n ; j ++){
				if(i==0&&j==1){
					max=data[j]-data[i];
				}
				if(max<(data[j]-data[i])){
					max= data[j]-data[i];
				}
				//System.out.println(data[i]-data[j]);
			}
		}
		System.out.println(max);
	}
}