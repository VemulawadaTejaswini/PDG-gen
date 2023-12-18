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
		/*
		for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
			System.out.println(e.getKey() + " key");
			ArrayList<Integer> value = e.getValue();
			for (int i = 0; i < value.size(); i++) {
				System.out.println(value.get(i));
			}
		}
		*/
		for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
			int key = e.getKey();
			ArrayList<Integer> value = e.getValue();
			if (value.size() == 1) continue;
			for (int i = 0; i < value.size(); i++) {
				three.put(key, map.get(value.get(i)));
				kazu[key].n += map.get(value.get(i)).size();
				kazu[key].n -= 1;
			}
		}

		/*
		for (int i = 0; i < size; i++) {
			System.out.println("i n "+ i +" "+kazu[i].n);
		}
		*/
		Arrays.sort(kazu);

		
		/*
		for (int i = 0; i < kazu.length; i++) {
			System.out.println("i n "+ i +" "+kazu[i].data);
		}
		
		*/
		int[] p = new int[size+1];
		Arrays.fill(p, -1);
		int nSan = 1;
				int nUsed = 0;
		for (int i = 3; i < size; i += 3) {
			Kazu x = kazu[nSan];
			p[i] = x.data;
			kazu[nSan].basyo = i;
			kazu[nSan].isUsed = true;
			nSan++;
			nUsed++;
		}
		boolean ansOk = true;
		int index = 0;
		int i = 0;
		while (nUsed < size) {
		//for (int i = nSan; i < size; i++) {
			int x = kazu[i].data;
			System.out.println(x);
			if (p[index] == -1) {
				p[index] = x;
				nUsed++;
				ArrayList<Integer> aa = three.get(x);
				if (aa == null) continue;
				for (int j = 0; j < aa.size(); j++) {
					int ax = aa.get(j);
					if (kazu[ax].isUsed) {
						if (Math.abs(index-kazu[ax].basyo) % 3 != 0 
							|| (index % 3 != 0 && kazu[ax].basyo %3 != 0)) {
							ansOk = false;
							break;
						}
					} else {

						for (int kk = index+3; kk < size; kk+=3) {
							if (p[kk] == -1) {
								p[kk] = ax;
								kazu[ax].isUsed = true;
								nUsed++;
								break;
							}
						}
					}
				}
			} else {
				i--;
			}
			i++;
			index++;
		}
		if (ansOk) {
			for (i = 0; i < size; i++) {
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