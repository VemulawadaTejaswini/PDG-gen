import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] arr = new int [11000];
		int sum = 0;
		for(int i = 0;i<num;i++){
			arr[i] = sc.nextInt();
			sum = arr[i]+sum;
		}
		int buffer;
		for(int i = 0; i<num-1;i++){
			if(arr[i]>arr[i+1]){
				buffer = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = buffer;
			}
		}
		int min = arr[num-1];

		for(int i=num-1;i>0;i--){
			if(arr[i]>arr[i-1]){
				buffer = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = buffer;
			}
		}
		int max = arr[1];
	    System.out.println(min+" "+max+" "+sum);
	}
}