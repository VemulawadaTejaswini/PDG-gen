import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = Integer.parseInt(sc.nextLine());
			if(n == 0 ) break;
			HashMap<Character,ArrayList<Data>> map = new HashMap<Character,ArrayList<Data>>();
			for(int i = 0; i < n; i++) {
				String[] in = sc.nextLine().split(" ");
				for(int j = 0; j < in.length; j++) {
					String tmp = in[j];
					if(map.containsKey(tmp.charAt(0))) {
						ArrayList<Data> x = map.get(tmp.charAt(0));
						boolean flg = false;
						for(int k = 0; k < x.size(); k++) {
							if(x.get(k).in.equals(tmp)) {
								flg = true;
								x.get(k).count++;
								break;
							}
						}
						if(!flg) {
							x.add(new Data(tmp,1));
						}	
					}
					else {
						ArrayList<Data>x = new ArrayList<Data>();
						x.add(new Data(tmp,1));
						map.put(tmp.charAt(0), x);
					}
				}
			}
			String ch = sc.nextLine();
			if(map.containsKey(ch.charAt(0))) {
				ArrayList<Data> x = map.get(ch.charAt(0));
				Collections.sort(x,new MyComp());
				for(int i = 0; i < Math.min(5, x.size()); i++) {
					if(i == 0) {
						System.out.print(x.get(i).in);
					}
					else {
						System.out.print(" " + x.get(i).in);
					}
				}
				System.out.println();
			}
			else {
				System.out.println("NA");
			}
		}
	}
	
	static class Data {
		String in;
		int count;
		Data(String a, int b) {
			in = a;
			count = b;
		}
	}
	
	static class MyComp implements Comparator<Data> {

		@Override
		public int compare(Data o1, Data o2) {
			if(o1.count < o2.count) {
				return 1;
			}
			if(o1.count > o2.count) {
				return -1;
			}
			return o1.in.compareTo(o2.in);
		}
		
	}
}     