import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] arr = new int[x + 1];
		for (int i = 0; i < x + 1; i++) {
			arr[i] = sc.nextInt();
		}
		int output = 0;
		int[] compare = new int[x];
		for (int i = 0; i < x; i++)
			compare[i] = sc.nextInt();
		for (int i = 0; i < x; i++) {
			int temp = compare[i];
			int index = i;
			while(temp>0||(arr[index]>0&&arr[index+1]>0)) {
				if (temp == arr[index]) {
					output += temp;
					arr[index] = 0;
					temp = 0;
					break;
				} 
				if (temp < arr[index]) {
					output += temp;
					arr[index] = arr[index] - temp;
					temp=0;
					break;
				} 
				if(temp>arr[index]) {
					output += arr[index];
					temp = temp - arr[index];
					arr[index] = 0;
					if (arr[index + 1] >= temp) {
						output += temp;
						arr[index + 1] = arr[index+1] - temp;
						temp = 0;
					} else {
						output += arr[index + 1];
						temp = temp-arr[index+1];
						arr[index + 1] = 0;
						
					}
					
				}
				if(arr[index]==0&&arr[index+1]==0)break;
				
				
				
			}
			/*for(int k = 0;k<arr.length;k++) {
				System.out.print(arr[k]);
			}*/
		

		}
		System.out.println(output);
		

	}

}