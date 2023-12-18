import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String[] split = line.split(" ");
		int N = Integer.parseInt(split[0]);
		int X = Integer.parseInt(split[1]);
		
		line = br.readLine();
		split = line.split(" ");
		int minVal = Integer.MAX_VALUE;
		int minInd = -1;
		int[] arr = new int[N];
		for(int i = 0; i<N; i++){
			arr[i] = Integer.parseInt(split[i]);
			if(arr[i] < minVal){
				minVal = arr[i];
				minInd = i;
			}
		}
		
		int currentShifts = 0;
		int maxShifts = 0;
		int totalShifts = 0;
		int[] minimums = new int[N];
		
		minimums[minInd] = minVal;
		for(int i = 1; i<N; i++){
			int prevInd = (minInd + i - 1)%N;
			int currentInd = (minInd + i)%N;
			int buyPrice = arr[currentInd];
			int evolvePrice = minimums[prevInd] + X;
			if(evolvePrice < buyPrice){
				currentShifts++;
				totalShifts += currentShifts;
				minimums[currentInd] = evolvePrice;
			}
			else{
				maxShifts = Math.max(maxShifts, currentShifts);
				currentShifts = 0;
				minimums[currentInd] = buyPrice;
			}
		}
		maxShifts = Math.max(maxShifts, currentShifts);
		
		long sum = 0;
		for(int i : minimums){
			sum += i;
		}
		//System.out.println("TOTAL: " + totalShifts + " MAX: " + maxShifts);
		sum -= (totalShifts - maxShifts) * X;
		
		System.out.println(sum);
		
		
	}
}