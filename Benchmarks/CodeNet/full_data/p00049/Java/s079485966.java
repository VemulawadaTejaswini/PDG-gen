import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] c = new int[4];
		while(sc.hasNext()){
			String b = sc.next().split(",")[1];
			if(b.equals("A"))c[1]++;
			else if(b.equals("B"))c[2]++;
			else if(b.equals("AB"))c[3]++;
			else c[4]++;
		}
		for(int i=0;i<4;i++)System.out.println(c[i]);
	}
}