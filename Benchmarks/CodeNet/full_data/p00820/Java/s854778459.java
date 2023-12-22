import java.util.*;
public class Main { 
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		makeList();
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int count = 0;
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i) > n) break;
				for(int j = i; j < list.size(); j++) {
					if(list.get(i) + list.get(j) > n) break;
					for(int k = j; k < list.size(); k++) {
						if(list.get(i) + list.get(j) + list.get(k) > n) break;
						for(int l = k; l < list.size(); l++) {
							if(list.get(i) + list.get(j) + list.get(k) + list.get(l) == n) {
								count++;
								break;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	public static void makeList() {
		for(int i = 0; i < 32768; i++) {
			if(i * i > 32768) {
				break;
			}
			list.add(i*i);
		}
	}
		
}