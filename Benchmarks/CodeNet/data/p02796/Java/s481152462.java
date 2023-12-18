public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		LinkedList<Pair2> list = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int l = scan.nextInt();
			list.add(new Pair2(x-l,x+l));
		}
		scan.close();
		
		list.sort(comparing(Pair2::getSecond));
		int num = 0;
		while(!list.isEmpty()) {
			int x = list.removeFirst().second;
			list = list.stream().filter(pair -> pair.first >= x).collect(Collectors.toCollection(LinkedList::new));
			num++;
		}
		System.out.println(num);
	}
}

class Pair2 {
	int first; 
	int second;
	
	public Pair2(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	public int getSecond() {
		return second;
	}
	
	public String toString() {
		return first + ":" + second;
	}
}