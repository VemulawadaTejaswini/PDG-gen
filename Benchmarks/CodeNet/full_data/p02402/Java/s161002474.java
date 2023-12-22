import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] input=sc.nextLine().split(" ");
		long[] num = new long[input.length];
		for(int i=0;i<input.length;i++){
			num[i]=Integer.parseInt(input[i]);
		}
		
		long min = num[0];
		long max = num[0];
		long sum = num[0];
		
		for(int i=1;i<input.length;i++){
			if(max<num[i]){
				max=num[i];
			}
			if(min>num[i]){
				min=num[i];
			}
			sum=sum+num[i];
		}
		System.out.println(min+" "+max+" "+sum);
	}
}