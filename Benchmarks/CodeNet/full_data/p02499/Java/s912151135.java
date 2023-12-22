import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line=sc.next();
		while(sc.hasNext()){
			String buf = sc.next();
			line+=buf;
			if(line.endsWith("."))break;
		}
		String  s =line.toLowerCase().replaceAll(" ", "").replaceAll(",", "");
		char c[] = s.toCharArray();
		int a[] =new int[26];
		for (int i = 0; i < c.length-1; i++) {
			a[(int)c[i]-97]++;
		}
		
		for (int i = 0; i < a.length; i++) {
			char w = (char)(97+i);
			System.out.println(w+" : "+a[i]);
		}
	}
}