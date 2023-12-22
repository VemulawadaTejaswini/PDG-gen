import java.util.Scanner;


public class Main{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int[] values = new int[a];
		String sr[] = new String[a];
		String str = "";

		for(int i=0 ; i<sr.length ; i++) {
			values[i] = s.nextInt();
		}
//		System.out.println(Arrays.toString(values).replaceAll("[,\\[\\]]", ""));
		for(int j=0 ; j<values.length ; j++) {

			if(j+1<values.length)
				System.out.print(values[j] + " ");
			else
				System.out.print(values[j]);
		}
		solve(values);
	}

	public static void solve(int[] values) {
		for(int i=1 ; i<values.length ; i++) {
			int targetV = values[i];
			int movableIndex = i - 1;
			while(movableIndex >= 0 && values[movableIndex] > targetV) {
				values[movableIndex + 1] = values[movableIndex];
				movableIndex--;
			}
			values[movableIndex + 1] = targetV;
//			System.out.println(Arrays.toString(values).replaceAll("[,\\[\\]]", ""));
			for(int j=0 ; j<values.length ; j++) {

				if(j+1<values.length)
					System.out.print(values[j] + " ");
				else
					System.out.print(values[j]);
			}
		}
	}
}