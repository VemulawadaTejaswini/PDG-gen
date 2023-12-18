import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static class Cake {
	 
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		long z = sc.nextLong();
		long k = sc.nextLong();
		List<Long> listx = new ArrayList<Long>();
		List<Long> listy = new ArrayList<Long>();
		List<Long> listz = new ArrayList<Long>();
		for(int i=0; i<x; i++) {
			listx.add(sc.nextLong());
		}
		for(int i=0; i<y; i++) {
			listy.add(sc.nextLong());
		}
		for(int i=0; i<z; i++) {
			listz.add(sc.nextLong());
		}
		List<Long> list = new ArrayList<Long>();
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				for(int p=0; p<z; p++) {
					list.add(listx.get(i)+listy.get(j)+listz.get(p));
				}
			}
		}
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0; i<k; i++) {
			System.out.println(list.get(i));
		}
    }
}
