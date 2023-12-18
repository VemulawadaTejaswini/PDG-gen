import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("CompSci31/Frog 1.in"));
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] cost = new int[n];
		cost[0]= 0;
		for(int i =0; i< n; i++){
			arr[i]= sc.nextInt();
		}
		cost[1]= Math.abs(arr[1]-arr[0]);
		for(int i = 2; i<n;i++ ){
			if(i==2){
				cost[2]= Math.min(Math.abs(arr[2]-arr[0]),Math.abs(arr[2]-arr[1])+cost[1]);
			}else{
				cost= minval(cost,arr,i);
			}
		}

		System.out.println(cost[n-1]);
		//try loops

	}
	public static int[] minval (int cost[],int arr[], int pos){
		cost[pos] = Math.min(Math.abs(arr[pos-2]-arr[pos])+cost[pos-2],Math.abs(arr[pos-1]-arr[pos])+cost[pos-1]);
		return cost;
	}

}
