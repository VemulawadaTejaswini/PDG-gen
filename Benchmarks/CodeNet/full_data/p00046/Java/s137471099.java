import java.util.ArrayList;
import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double max = 0;
		double min = 0;
		double num = 0;
		ArrayList<Double> height = new ArrayList<Double>();
		while(sc.hasNext()){
			height.add(sc.nextDouble());
		}
		for(int i = 0; i < height.size();i++){
			num = height.get(i);
			if(max<num){
				max = num;
			}
			if(min>num){
				min = num;
			}
		}
		num = max - min;
		System.out.println(num);
	}
}