import java.util.*;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer, ArrayList<Integer>> three = new HashMap<>();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		Kazu[] kazu = new Kazu[N+1];
		Kazu k = new Kazu(-1, 0);
		Arrays.fill(kazu, k);
		ArrayList<Integer> arrayA;
		ArrayList<Integer> arrayB;
		int size = 0;

		for (int i = 0; i < N-1; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (size < a) 
				size = a;
			if (size < b)
				size = b;

			if (kazu[a].data == -1) {
				kazu[a] = new Kazu(a, 0);
			}
			if (kazu[b].data == -1) {
				kazu[b] = new Kazu(b, 0);
			}

			if (map.containsKey(a)) {
				arrayA = map.get(a);
			} else {
				arrayA = new ArrayList<>();
			}
			arrayA.add(b);
			map.put(a, arrayA);

			if (map.containsKey(b)) {
				arrayB = map.get(b);
			} else {
				arrayB = new ArrayList<>();
			}
			arrayB.add(a);
			map.put(b, arrayB);
		}
		for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
			int key = e.getKey();
			ArrayList<Integer> value = e.getValue();
			for (int i = 0; i < value.size(); i++) {
				three.put(key, map.get(value.get(i)));
				kazu[key].n += map.get(value.get(i)).size();
			}
		}
		Arrays.sort(kazu);

		int[] p = new int[size+1];
		Arrays.fill(p, -1);
		int nSan = 0;
		for (int i = 3; i < size; i += 3) {
			Kazu x = kazu[nSan];
			p[i] = x.data;
			kazu[nSan].basyo = i;
			kazu[nSan].isUsed = true;
			nSan++;
		}
		boolean ansOk = true;
		int index = 0;
		for (int i = nSan; i < size; i++) {
			int x = kazu[i].data;
			if (p[index] == -1) {
				p[index] = x;
				ArrayList<Integer> aa = three.get(x);
				for (int j = 0; j < aa.size(); j++) {
					int ax = aa.get(j);
					if (kazu[ax].isUsed) {
						if (Math.abs(index-kazu[ax].basyo) % 3 != 0) {
							ansOk = false;
							break;
						}
					} else {

						for (int kk = index+3; kk < size; kk++) {
							if (p[kk] == -1) {
								p[kk] = ax;
								kazu[ax].isUsed = true;
								break;
							}
						}
					}
				}
 				index++;
			}
		}
		if (ansOk) {
			for (int i = 0; i < size; i++) {
				System.out.print(p[i] + " ");
			}
		} else {
			System.out.println(-1);
		}
	}

	static class Kazu implements Comparable<Kazu>{

		int data;
		int n;
		int basyo;
		boolean isUsed;

		public Kazu(int data, int n) {
			this.data = data;
			this.n = n;	
			basyo = -1;
			isUsed = false;
		}

		public int compareTo(Kazu k) {
			return this.n - k.n;
		}
	}
}