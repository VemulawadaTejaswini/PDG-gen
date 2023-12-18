import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private String city;
	private int point;
	private int numRestaurant;

	public Main(String city, int point, int numRestaurant) {
		this.city = city;
		this.point = point;
		this.numRestaurant = numRestaurant;
	}

	public static int[] sort(ArrayList<Main> list, int n) {
		ArrayList<Main> sorted = new ArrayList<Main>();
		sorted.add(list.get(0));
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(sorted.get(j).city.compareTo(list.get(i).city) > 0) {
					for(int k = i ; k > j ; k--) {
						sorted.set(k, sorted.get(k-1));
					}
					sorted.set(j, list.get(i));
				}else if(sorted.get(j).city.compareTo(list.get(i).city) == 0) {
					if(sorted.get(j).point > list.get(i).point) {
						for(int k = i ; k > j ; k--) {
							sorted.set(k, sorted.get(k-1));
						}
						sorted.set(j, list.get(i));
					}
				}
			}
		}

		int[] answer = new int[n];
		for(int i=0;i<n;i++) {
			answer[i] = sorted.get(i).numRestaurant;
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = new String[n];
		int[] p = new int[n];
		ArrayList<Main> list = new ArrayList<Main>();
		for(int i = 0; i < n; i++) {
			s[i] = scan.next();
			p[i] = scan.nextInt();
		}

		for(int i=0;i<n;i++) {
			Main main = new Main(s[i], p[i], (i+1));
			list.add(main);
		}

		int ans[] = Main.sort(list, n);

		for(int i = 0;i<0;i++) {
			System.out.println(ans[i]);
		}

		scan.close();

	}

}
