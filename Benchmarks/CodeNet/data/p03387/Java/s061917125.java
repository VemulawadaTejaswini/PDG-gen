import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		int count = 0;
		for(int i = 0; i < 3;i++) array[i] = sc.nextInt();
		while(array[0] != array[1] || array[0] != array[2]){
			int minNum = 0;
			int maxNum = 0;
			for(int i = 1; i <3;i++){
				if(array[minNum] > array[i]) minNum = i;
				else if(array[maxNum] < array[i]) maxNum = i;
			}
			if(array[maxNum] - array[minNum] > 1){
				array[minNum] += 2;
				count++;
				continue;
			}
			for(int i = 0; i <3; i++) if(i != maxNum) array[i]++;
			count++;
		}
		System.out.println(count);
	}
}