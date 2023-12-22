import java.util.*;
import java.io.*;

class Main {

	static class Data {
		int point;
		int data;
	}

	static final Comparator<Data> COMPARATOR = new Comp();

	static class Comp implements Comparator<Data> {
		public int compare(Data x,Data y){
			if (x.data > y.data)
				return 1;
			else if(x.data < y.data)
				return -1;
			else
				return 0;
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();

		String[] str = s.split(" ");
		Data[] w = new Data[n];
		PriorityQueue<Data> pq = new PriorityQueue<Data>(10,COMPARATOR);

		for (int i=0; i<n; i++) {
			w[i] = new Data();
			w[i].data = Integer.parseInt(str[i]);
			pq.add(w[i]);
		}

		for (int i=0; i<n; i++) {
			pq.poll().point = i;
		}


		int count = 0;
		int sum = 0;

		while (count < n) {
			boolean flag = false;
			for (int i=0; i<n; i++) {
				if (w[i].point == count) {
					flag = true;
					if (w[i].point == i) {
						count++;
						break;
					}
					for (int j=0; j<n; j++) {
						if (w[j].point == i) {
							sum += w[i].data + w[j].data;
							w[j].point = w[i].point;
							w[j].data = w[i].data;
							w[i].point = -1;
							flag = false;
							break;
						}
					}
					if (!flag) {
						flag = true;
						break;
					}
				}
			}
			if (!flag) {
				count++;
			}
		}

		System.out.println(sum);

		br.close();
	}
}