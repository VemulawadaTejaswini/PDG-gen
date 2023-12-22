import java.util.Scanner;
public class Main {
private static Scanner s;
public static void main(String[] args) {
	s = new Scanner(System.in);
	int a = s.nextInt();
	int minj;
	boolean flag = false;
	String[] bstr = new String[a];
	String[] sstr = new String[a];

	for(int i = 0;i < a;i++) {
		String str = s.next();
		bstr[i] = str;
		sstr[i] = str;
	}
	for(int i = 0;i < a;i++) {
		for(int j = a-1;j >= i+1;j--) {
			if(bstr[j].charAt(1) < bstr[j-1].charAt(1)) {
	String tmp = bstr[j];
	bstr[j] = bstr[j-1];
	bstr[j-1] = tmp;
			}
		}
	}
	for(int i = 0;i < a;i++) {
		System.out.print(bstr[i]);
		if(i == a-1) {
			System.out.println("");
		}else {
			System.out.print(" ");
		}
	}
		System.out.println("Stable");

	for(int i=0;i < a;i++) {
		minj = i;
		for(int j = i;j < a;j++) {
			if(sstr[j].charAt(1) < sstr[minj].charAt(1)) {
				minj = j;
			}
		}
		if(i != minj) {
			String tmp;
			tmp = sstr[i];
			sstr[i] = sstr[minj];
			sstr[minj] = tmp;
		}
		for(int q = 0;q < a;q++)System.out.print(sstr[q]);
		System.out.println("");

	}
	for(int i = 0;i < a;i++) {
		System.out.print(sstr[i]);
		if(i == a-1) {
			System.out.println("");
		}else {
			System.out.print(" ");
		}
	}
	for(int i=0;i < a;i++) {
		if(bstr[i].equals(sstr[i]) != true) {
		flag = false;
		break;
		}else {
			flag = true;
		}
	}
	if(flag == true) {
		System.out.println("Stable");
		}else {
			System.out.println("Not Stable");
		}
}
}

