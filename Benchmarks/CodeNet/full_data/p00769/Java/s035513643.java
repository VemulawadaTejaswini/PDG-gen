import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Data now = new Data();
			String in = sc.next();
			for(int j = 0; j < in.length(); j++) {
				if(in.charAt(j) == '[') {
					Data tmp = new Data();
					tmp.p = now;
					now.list.add(tmp);
					now = tmp;
				}
				else if(in.charAt(j) == ']') {
					now = now.p;
				}
				else {
					int k = j;
					for(; k < in.length(); k++) {
						if(in.charAt(k) == ']') {
							break;
						}
					}
					int s = Integer.parseInt(in.substring(j,k));
					
					now.sum = s;
					j = k-1;	
				}
			}
			int ans = solv(now);
			System.out.println(ans);
		}
		
		
		
	}
	
	static class Data {
		Data p;
		ArrayList<Data> list = new ArrayList<Data>();
		int sum = 0;
	}
	
	static int solv(Data a) {
		if(a.list.isEmpty()) {
			return a.sum/2+1;
		}
		
		int ret = 0;
		
		int[] list = new int[a.list.size()];
		
		
		for(int i = 0; i < a.list.size(); i++) {
			list[i] = solv(a.list.get(i));
		}
		
		Arrays.sort(list);
	
		for(int i = 0; i < list.length / 2 + 1; i++) {
			ret += list[i];
		}
		
		return ret;
	}
	
}
			