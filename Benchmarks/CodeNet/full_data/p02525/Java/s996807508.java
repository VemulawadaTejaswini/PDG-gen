import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		ArrayList<Double> result = new ArrayList<Double>();
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		//\bhÉªÅ«éª¢¢¼Oªv¢Â©È¢
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			setInputsToList(n, sc, scores);
			result.add(getDeclination(scores));
			scores.clear();
		}
		
		//WÎ·ÌoÍ
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
		
	}
	
	private static void setInputsToList(int n, Scanner sc, ArrayList<Integer> list){
		for(int i = 0; i < n; i++){
			list.add(sc.nextInt());
		}
	}
	
	private static double getAverage(ArrayList<Integer> list){
		double result = 0;
		for(int i = 0; i < list.size(); i++){
			result = result + list.get(i);
		}
		return result / list.size();
	}
	
	private static double getSum(ArrayList<Integer> list){
		double result = 0;
		double avg = getAverage(list);
		for(int i = 0; i < list.size(); i++){
			result = result + (list.get(i) - avg) * (list.get(i) - avg);
		}
		return result;
	}
	
	public static double getDeclination(ArrayList<Integer> list){
		return Math.sqrt(getSum(list) / list.size());
	}
}