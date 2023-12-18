import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String[] split = line.split(" ");
		int N = Integer.parseInt(split[0]);
		long X = Integer.parseInt(split[1]);
		
		line = br.readLine();
		split = line.split(" ");
		long minVal = Integer.MAX_VALUE;
		int minInd = -1;
		long[] arr = new long[N];
		for(int i = 0; i<N; i++){
			arr[i] = Integer.parseInt(split[i]);
			if(arr[i] < minVal){
				minVal = arr[i];
				minInd = i;
			}
		}
		
		long currentShifts = 0;
		long maxShifts = 0;
		long totalShifts = 0;
		long[] minimums = new long[N];
		
		minimums[minInd] = minVal;
		for(int i = 1; i<N; i++){
			int prevInd = (minInd + i - 1)%N;
			int currentInd = (minInd + i)%N;
			long buyPrice = arr[currentInd];
			long evolvePrice = minimums[prevInd] + X;
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
		for(long i : minimums){
			sum += i;
		}
		//System.out.println("TOTAL: " + totalShifts + " MAX: " + maxShifts);
		long freeCost = (totalShifts - maxShifts);
		freeCost *= X;
		sum -= freeCost;
		
		System.out.println(sum);
		
		
	}
}