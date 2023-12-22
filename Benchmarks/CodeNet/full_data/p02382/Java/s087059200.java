import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> xlist = new ArrayList<Integer>();
		List<Integer> ylist = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			xlist.add(Integer.parseInt(sc.next()));
		}
		for (int i = 0; i < n; i++) {
			ylist.add(Integer.parseInt(sc.next()));
		}
		double d1,d2,d3,d4;
		d1 = d2 = d3 = d4 = 0;
		for (int i = 0; i < n; i++) {
			d1 += Math.abs(xlist.get(i) - ylist.get(i));
			d2 += (xlist.get(i) - ylist.get(i))*(xlist.get(i) - ylist.get(i));
			d3 += Math.abs((xlist.get(i) - ylist.get(i))*(xlist.get(i) - ylist.get(i))*(xlist.get(i) - ylist.get(i)));
			double tmp = Math.abs(xlist.get(i) - ylist.get(i));
			if (d4 < tmp) d4=tmp;
		}
		d2 = Math.sqrt(d2);
		d3 = Math.pow(d3, 1.0/3.0);
		System.out.println(String.format("%.5f", d1));
		System.out.println(String.format("%.5f", d2));
		System.out.println(String.format("%.5f", d3));
		System.out.println(String.format("%.5f", d4));
	}
}

