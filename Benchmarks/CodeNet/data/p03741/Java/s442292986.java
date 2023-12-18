import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =  Integer.valueOf(br.readLine());
		String[] t = br.readLine().split(" ");
		ArrayList<Integer>  arr = new ArrayList<Integer>();
		for (String a : t){
			arr.add(Integer.valueOf(a));
		}
		
		int count = 0;
		int sum = 0;
		int temp =0;
		for (int j = 0 ; j < n ; j++){
			if(j == 0){
				sum = arr.get(j);
				continue;
			}
			
			temp = arr.get(j);
			if(sum * (sum + temp) >0){
				if(sum > 0) {
					 count += Math.abs((-1 -sum) - temp);
					sum = -1;
				}
				else if(sum < 0) {
					 count += Math.abs((1 -sum) - temp);
					sum = 1;	
				}
			}else if (sum + temp == 0){
				count += 1;
				if(sum > 0) sum = -1;
				else if(sum < 0) sum = 1;
			}else{
			sum += arr.get(j);
			}
		}
		System.out.println(count);
	}

}