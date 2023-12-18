import java.util.*;
public class Main {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int height[] = new int[num];
		for(int i = 0; i < num; i ++) {
			height[i] = sc.nextInt();
		}

		reduceHeight(height, 0, num);

		System.out.println(count);
	}

	public static void reduceHeight(int height[], int first, int last) {
		if(first != last) {
			int min = height[first];
			int index = first;
			for(int i = first; i < last; i ++) {
				if(height[i] < min) {
					min = height[i];
					index = i;
				}
			}
			boolean shouldContinue = false;
			for(int i = first; i < last; i ++) {
				height[i] -= min;
			}
			count += min;
			reduceHeight(height, first, index);
			reduceHeight(height, index + 1, last);
		}
	}
}