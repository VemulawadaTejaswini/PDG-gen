import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		String[] a = string.split(" ");
		ArrayList<Integer> number=new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			if (a[i] == "+") {
				int p=number.get(0);
				number.remove(0);
				int q=number.get(0);
				number.remove(0);
				number.add(p+q);

				
			}
			if(a[i]=="-"){
				int p=number.get(0);
				number.remove(0);
				int q=number.get(0);
				number.remove(0);
				number.add(p-q);
				
			}
			if(a[i]=="*"){
				int p=number.get(0);
				number.remove(0);
				int q=number.get(0);
				number.remove(0);
				number.add(p*q);
				
			}
			
			int n=Integer.parseInt(a[i]);
			number.add(n);
			
			
		}
		
		System.out.println(number.get(0));
		
	}
}