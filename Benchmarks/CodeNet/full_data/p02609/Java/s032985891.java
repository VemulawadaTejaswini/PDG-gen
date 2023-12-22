import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] map = new int[200001];
		map[0] = 0;
		map[1] = 1;
		for (int i = 2; i < 200001; i++) {
			int temp = i % countOne(i);
			if (temp == 0) {
				map[i] = 1;
			} else {
				map[i] = map[temp]+1;
			}
		}

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String n = sc.next();

		char[] array = n.toCharArray();
		int count = 0;
		BigInteger init = new BigInteger("0");
		for (int i = 0; i < array.length;i++) {
			if (array[i] == '1') {
				count++;
				init = init.add(new BigInteger("2").pow(array.length -1- i));
			}
		}

		for (int i = 0; i < array.length;i++) {
			String string = null;
			int newCount = count;
			char[] newArray = Arrays.copyOf(array, array.length);
			BigInteger a = init;
			if (array[i] == '1') {
				newArray[i] = '0';
				string = String.valueOf(newArray);
				newCount-=1;
				a = a.subtract(new BigInteger("2").pow(array.length -1-i));
			} else {
				newArray[i] = '1';
				string = String.valueOf(newArray);
				newCount+=1;
				a = a.add(new BigInteger("2").pow(array.length -1-i));
			}

			BigInteger re = a.remainder(new BigInteger(String.valueOf(newCount)));
//			System.out.print(a.toString()+ " " + string + " " + newCount + " ");
//			System.out.print(re.toString() + " ");
			System.out.println(map[Integer.valueOf(re.toString())]+1);
		}

	}

	private static int countOne(int i) {
		char[] array = new char[18];
		int k = 0;
		while(i >= 1) {
			int temp = i%2;
			i = i/2;
			array[k++] = Integer.toString(temp).charAt(0);
		}

//		String two = String.valueOf(array);
//		StringBuilder sb = new StringBuilder();
//		sb.append(two);
//		sb = sb.reverse();
//		System.out.println(sb.toString());
		int count = 0;
		for (int j = 0; j < array.length; j++) {
			if (array[j] == '1') {
				count++;
			}
		}
		return count;
	}

}
