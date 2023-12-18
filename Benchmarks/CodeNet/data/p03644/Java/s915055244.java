import java.io.*;
import java.util.*;

public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		int hiCount = 0;
		int tempNumb = 0;
		int count = 0;
		for(int i = n; i > 0; i--){
			tempNumb = i;
			//System.out.println("temp: " + tempNumb);
			while(i % 2 == 0) {
				count++;
				i = i/2;
			}
			//System.out.println(tempNumb);
			i = tempNumb;
//			System.out.println("i: " + i + " Count: " + count);
//			System.out.println("High Count: " + hiCount);
			if(count > hiCount) {
				result = tempNumb;
				hiCount = count;
			}
			count = 0;
		}
		System.out.println(result);

		sc.close();
	}
	
}