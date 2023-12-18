import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int goal = sc.nextInt();
		sc.close();
	
		int time=1;
		HashSet<Integer> xList = new HashSet<Integer>();
		xList.add(0);
		
		while(true){
			if(xList.contains(goal)){
				break;
			}else{
				time++;
				Integer[] currentX = (Integer[]) xList.toArray(new Integer[xList.size()]);
				xList = new HashSet<Integer>();	
				for(int x: currentX){
					xList.add(x+time);
					xList.add(x-time);
					xList.add(x);
				}
			}	
		}
		
		System.out.println(time);

	}

}