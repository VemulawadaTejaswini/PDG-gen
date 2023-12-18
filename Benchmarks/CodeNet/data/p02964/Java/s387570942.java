import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long K = scn.nextLong();
		Number[] A = new Number[N];

		int[] first = new int[N + 1];
		int[] last = new int[N + 1];
		Arrays.fill(first, -1);
		Arrays.fill(last, -1);

		for (int i = 0; i < N; i++) {
			int a = scn.nextInt();
			if (first[a] == -1)
				first[a] = i;
			if (last[a] != -1) {
				A[last[a]].setNext(i);
			}
			A[i] = new Number(a);
			last[a] = i;
		}
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> buf = new ArrayList<Integer>();
		do {
			ans.add(buf);
			int start;
			if(buf.isEmpty()) {
				start = 0;
			}else {
				start = first[buf.get(0)]+1;
			}
			buf = new ArrayList<Integer>();
			for(;start < N;start++) {
				Number a = A[start];
				if(a.next==-1) {
					buf.add(a.value);
				}else {
					start = a.next;
				}
			}
		} while (!buf.isEmpty());

		ArrayList<Integer> real_ans = ans.get((int)(K%(ans.size())));

		for(int i = 0;i < real_ans.size();i++) {
			System.out.print(((i==0)?"":" ")+real_ans.get(i));
		}
		if(real_ans.size()==0) {
			System.out.println("");
		}


	}

}

class Number {
	int value;
	int next;

	public Number(int value) {
		this.value = value;
		this.next = -1;
	}

	public void setNext(int next) {
		this.next = next;
	}

}
