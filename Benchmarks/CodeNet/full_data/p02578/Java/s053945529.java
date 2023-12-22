import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int sum = 0;
		List<Integer> height = new ArrayList<>();
		for(int i = 0; i < length; i++){
			height.add(sc.nextInt());
		}
		for(int i =1;i < height.size(); i++){
			if(height.get(i) - height.get(i-1) > 0){
				sum += height.get(i) - height.get(i-1);
				height.set(i, height.get(i) + (height.get(i) - height.get(i-1)));
			}
		}
		System.out.println(sum);
	}
}