import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] sArray = s.split("");
		for(int i =0;i < (sArray.length -1)/2;i++) {
			if(!sArray[i].equals(sArray[sArray.length-1-i])) {
				System.out.println("No");
				return;
			}
		}
		String left = s.substring(0, (s.length()-1)/2);
		String[] leftArray = left.split("");
		for(int i =0;i < leftArray.length/2;i++) {
			if(!leftArray[i].equals(leftArray[leftArray.length-1-i])) {
				System.out.println("No");
				return;
			}
		}

		String right = s.substring(((s.length()+3)/2) -1);
		String[] rightArray = right.split("");
		for(int i =0;i < rightArray.length/2;i++) {
			if(!rightArray[i].equals(rightArray[rightArray.length-1-i])) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");

	}
}