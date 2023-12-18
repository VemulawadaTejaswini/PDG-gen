import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		Comparator<int[]> comparator_0 = new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return Integer.compare(o1[0], o2[0]);
		    }
		};
		Comparator<int[]> comparator_1 = new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return Integer.compare(o1[1], o2[1]);
		    }
		};
		Comparator<int[]> comparator_2 = new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return Integer.compare(o1[2], o2[2]);
		    }
		};
		ArrayList<int[]> list = new ArrayList<int[]>();
		for (int i=0;i<M;i++) {
			int P = Integer.parseInt(sc.next());
			int Y = Integer.parseInt(sc.next());
			int[] tmp = {i, P, Y , 0};
			list.add(tmp);
		}
//		Collections.sort(list, comparator_2);
//		Collections.sort(list, comparator_1);
		int index=1;
		int former=0;
		for (int i=0;i<M;i++) {
			int value_1=list.get(i)[1];
			int value_3=list.get(i)[3];
			if (former==value_1) {
				index++;
				value_3=index;
				former=value_1;
			} else {
				index=1;
				value_3=index;
				former=value_1;
			}
		}
//		Collections.sort(list, comparator_0);
		for (int i=0;i<M;i++) {
			System.out.printf("%06d%06d",list.get(i)[1],list.get(i)[3]);
			System.out.println("");
		}
	}
}