
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] list = new int[n];
		for(int i=0; i<n; i++){
			list[i] = scan.nextInt();
		}

		ArrayList<Integer> array = new ArrayList<>();
		array.add(0);
		int j = 0;
		int answer = -1;
		int count = 0;
		while(j<n && (!array.contains(1))){
			if(array.contains(list[j]-1)){
				break;
			}else {
				array.add(list[j]-1);
				count++;
				if(list[j]==2){
					answer = count;
				}
				j = list[j]-1;
			}
		}

		System.out.println(answer);
	}
}
