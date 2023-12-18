import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();

		int a = scan.nextInt();

		String b = scan.nextLine();

		b = scan.nextLine();

		String c[] = b.split(" ");

		for(int i=0;i<c.length;i++) {
			int jud = 0;
			for(int j=0;j<array.size();j++) {
				if(Integer.parseInt(c[i]) == array.get(j)) {
					jud++;
				}
			}
			if (jud==0) {array.add(Integer.parseInt(c[i]));}
		
		}

		/*
		for (int seiseki: array){
			  System.out.println(seiseki);
		}
		*/

		int count=0;
		//Arrays.sort(array);
		Collections.sort(array);
		
		for(int i=0;i<array.size();i++){
			for(int j=i+1;j<array.size();j++) {
				if(array.get(i)<array.get(j)) {
					count++;
					i=j;
					break;
				}
			}
		}
		System.out.print(count);

	}

}
