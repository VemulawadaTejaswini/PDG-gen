import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class data {
		String key;
		LinkedList<String> C = new LinkedList<String>();

		boolean equals(data t) {
			return t.key.equals(key);
		}
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();

			LinkedList<String> used = new LinkedList<String>();

			data d[] = new data[n];
			for (int i = 0; i < n; i++) {
				String buffer = sc.next();
				buffer = buffer.replace(':', ' ').replace(',', ' ').replace(
						'.', ' ');
				Scanner bin = new Scanner(buffer);

				String k = bin.next();
				d[i] = new data();
				d[i].key = k;

				for (; bin.hasNext();) {
					String a = bin.next();
					d[i].C.add(a);
				}
			}

			for (int i = 0; i < d[0].C.size(); i++) {
				String are = d[0].C.get(i);

				int index = -1;

				for (int j = 0; j < n; j++) {
					if (d[j].key.equals(are)) {
						index = j;
						break;
					}
				}

				if (index == -1) {
					if(!used.contains(are)){
						used.add(are);
					}
				} else {
					for (String k : d[index].C) {
						if (!d[0].C.contains(k)) {
							d[0].C.add(k);
						}
					}
				}

			}
			System.out.println(used.size());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}