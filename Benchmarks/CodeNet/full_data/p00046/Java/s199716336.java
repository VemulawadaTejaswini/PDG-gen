
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Mountain> listMountain = new ArrayList<Mountain>(0);
		String input;
		while((input = br.readLine()) != null){
			listMountain.add(new Mountain(Double.parseDouble(input)));
		}
		sort(listMountain);
		System.out.println(getMaxHeightDifference(listMountain));
	}
	
	private static void sort(ArrayList<Mountain> listMountain){
		for(int lastIndex = listMountain.size() - 1; lastIndex > 0; lastIndex--){
			for(int currentIndex = 0; currentIndex < lastIndex;	currentIndex++){
				if(listMountain.get(currentIndex).getHeight() > listMountain.get(currentIndex + 1).getHeight()){
					Mountain high = listMountain.get(currentIndex);
					Mountain low = listMountain.get(currentIndex + 1);
					listMountain.set(currentIndex, low);
					listMountain.set(currentIndex + 1, high);
				}
			}
		}
	}
	
	private static double getMaxHeightDifference(ArrayList<Mountain> listMountain){
		return listMountain.get(listMountain.size() - 1).getHeight() - listMountain.get(0).getHeight();
	}
}

class Mountain{
	private final double height;
	
	Mountain(double height){
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
}