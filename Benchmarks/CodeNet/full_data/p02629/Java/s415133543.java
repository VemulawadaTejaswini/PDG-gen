import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		List<Integer> list = new ArrayList<>();
		String str = "abcdefghijklmnopqrstuvwxy";
		StringBuilder sb = new StringBuilder();
		while(n > 0){
			long amari = n%26;
			n = n/26;
			list.add((int)amari);
		}
		// System.out.println(list);
		for(int i=0; i<list.size(); i++){
			int amari = list.get(i);
			if(amari == 0) {
				for(int j=i+1; i<list.size()-1; j++){
					if(list.get(j) == 1) {
						sb.append('z');
						i++;
					} else {
						break;
					}
				}
			} else {
				sb.append(str.charAt(amari-1));
			}
		}
		System.out.println(sb.reverse());
	}
}
