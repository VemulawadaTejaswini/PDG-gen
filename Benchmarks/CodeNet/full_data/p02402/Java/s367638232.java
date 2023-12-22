import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] num = new int[n];
		String[] input = scanner.nextLine().split(" ");
		num[0] =Integer.parseInt(input[0]);
		int sum = num[0];
		int max = num[0];
		int min = num[0];
		for(int i=1;i<n;i++){
			num[i]=Integer.parseInt(input[i]);	
			sum =sum+num[i];
			if(max<num[i]){
				max=num[i];
			}else if(min>num[i]){
				min=num[i];
			}
			
		}
		System.out.println(min+" "+max+" " +sum);
	}
}