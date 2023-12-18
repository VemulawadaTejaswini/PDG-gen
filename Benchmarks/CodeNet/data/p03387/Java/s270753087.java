import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		int count = 0;
		for(int i = 0; i < 3;i++) array[i] = sc.nextInt();
		while(array[0] != array[1] || array[0] != array[2]){
			if(array[0] != array[1] && array[1] != array[2] && array[0] != array[2]){
				int minNum = 0;
				for(int i = 1; i < 3; i++) if(array[minNum] > array[i]) minNum = i;
				array[minNum] += 2;
				count++;
				continue;
			}
			int maxNum = 0;
			for(int i = 1; i <3;i++) if(array[maxNum] < array[i]) maxNum = i;
			for(int i = 0; i < 3;i++) if(i != maxNum) array[i]++;
			count++;
		}
		System.out.println(count);
	}
}