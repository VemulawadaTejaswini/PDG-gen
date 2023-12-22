import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	class Data {
		int id;
		int suc;
		int rank;

		Data(int id, int suc) {
			this.id = id;
			this.suc = suc;
		}
	}

	public void run() {
		List<Data> list = new ArrayList<Main.Data>();
		while (true) {
			String[] str = sc.next().split(",");
			if ("0".equals(str[0]) && "0".equals(str[1]))
				break;

			list.add(new Data(Integer.parseInt(str[0]), Integer
					.parseInt(str[1])));
		}
		Collections.sort(list, new Comparator<Data>() {
			@Override
			public int compare(Data o1, Data o2) {
				return o2.suc - o1.suc;
			}
		});

		for(int i=0,s=list.size(),rank=0,val=100;i<s;i++){
			Data data=list.get(i);
			if(data.suc!=val){
				rank++;
				val=data.suc;
			}
			data.rank=rank;
		}

		while (sc.hasNext()) {
			ln(list.get(sc.nextInt()).rank);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}