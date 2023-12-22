import java.io.*;
import java.util.*;
public class Main {
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	int sum = 0;
	int max = 0;
	int min = 2147483647;
	int dataset = 0;
	int input = 0;
	ArrayList<Integer> output = new ArrayList<Integer>(0);
	public static void main(String []args){
		Main r = new Main();
		r.Run();
	}
	public void Run(){
		try{
			while(true){
				String s = read.readLine();
				dataset = Integer.parseInt(s);
				if(dataset == 0)break;
				sum = 0;
				min = 2147483647;
				max = 0;
				for(int z = 0;z < dataset;z++){
					s = read.readLine();
					input = Integer.parseInt(s);
					sum += input;
					if(input < min)min = input;
					if(input > max)max = input;
				}
				sum -= max+min;
				output.add(sum/(dataset-2));
			}
		}catch(Exception e){
			
		}
		for(int z = 0;z < output.size();z++){
			System.out.println(output.get(z));
		}
	}
}