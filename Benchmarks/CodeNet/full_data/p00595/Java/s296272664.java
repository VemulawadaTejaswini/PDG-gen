import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Problem A: Greatest Common Divisor
Please find the greatest common divisor of two natural numbers. 
A clue is: The Euclid's algorithm is a way to resolve this task.

Input
The input file consists of several lines with pairs of two natural numbers in each line. 
The numbers do not exceed 100000.
The number of pairs (datasets) is less than 50.

Output
Your program has to print the greatest common divisor for each pair of input numbers. 
Print each result on a new line.*/
public class Main{
	
	public static void main(String[] args){
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		StringBuilder stringBuilder = new StringBuilder();

		try{
			String dataSet;
			while((dataSet = bufferedReader.readLine()) != null){
				if(dataSet.length()==0) break;
				String[] dataList = dataSet.split(" ");
				int x = Integer.parseInt(dataList[0]);
				int y = Integer.parseInt(dataList[1]);
				if(x>y){
					stringBuilder.append(gcd(x, y) + "\n");	
				}else
				stringBuilder.append(gcd(y, x) + "\n");
			}
			System.out.print(stringBuilder);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	static int gcd(int x, int y){
		if(y==0){
			return x;
		}else{
			return gcd(y, x%y);
		}
	}
}