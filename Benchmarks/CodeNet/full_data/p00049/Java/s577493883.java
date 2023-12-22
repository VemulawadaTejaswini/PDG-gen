import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String type;
		String[] strings;
		int[] types = new int[4];

		while(sc.hasNext()){
			strings = sc.next().split(",");
			type = strings[1];

			if(type.equals("A")) types[0]++;
			else if(type.equals("B")) types[1]++;
			else if(type.equals("AB")) types[2]++;
			else types[3]++;

			System.out.println(types[0]);
		}

		for(int value: types) System.out.println(value);
	}
}