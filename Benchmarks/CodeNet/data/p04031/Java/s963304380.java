import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] arr = new int[n];
		int beforeNum = 0;
		boolean isAllEqual = true;
		int targetNum = 0;

		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(sc.next());
			if(isAllEqual){
				isAllEqual = (beforeNum == arr[i]) ? true : false;
			}
		}

		if(isAllEqual){
			System.out.println(0);
		}else{
			targetNum = calcAve(arr);
			System.out.println(calcCost(arr, targetNum));
		}

	}

	public static int calcAve(int[] arr){
		return (int)Math.round((double)calcSum(arr) / (double)arr.length);
	}

	public static int calcSum(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}

	public static int calcCost(int[] arr, int target){
		int cost = 0;
		for(int i = 0; i < arr.length; i++){
			cost += Math.pow((arr[i] - target), 2);
		}
		return cost;
	}
}