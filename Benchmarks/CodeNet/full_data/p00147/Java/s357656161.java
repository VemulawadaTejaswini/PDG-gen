import java.util.*;
public class Main{

	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		int[] list = new int[100];
		int[] at = new int[17];
		int[] s = new int[17];
		int count = 0;
		Queue<Data> que = new ArrayDeque<Data>();
		for(int i = 0; i < 1000; i++) {
			for(int j = 0; j < 17; j++) {
				at[j]--;
				if(at[j] == 0) {
					s[j] = -1;
				}
				if(at[j] == -1) {
					at[j] = 0;
					s[j] = -1;
				}
			}
			if(i % 5 == 0 && i < 500) {
				if(count % 5 == 1) {
					que.add(new Data(count,5));
				}
				else {
					que.add(new Data(count, 2));
				}
				count++;
			}
			INX:while(!que.isEmpty()) {
				Data tmp = que.peek();
				IN:for(int j = 0; j < 17; j++) {
					for(int k = 0; k < tmp.val; k++) {
						if(j + k >= 17) break INX;
						if(s[j + k] != -1) continue IN;
					}
					for(int k = 0; k < tmp.val; k++) {
						s[j + k] = tmp.num;
						at[j + k] = 17 * (tmp.num % 2) + 3 * (tmp.num % 3) + 19;
					}
					que.poll();
					continue INX;
				}
				break INX;
			}
			ArrayDeque<Data> tmp = new ArrayDeque<Data>();
			while(!que.isEmpty()) {
				list[que.peek().num]++;
				tmp.add(que.poll());
			}
			while(!tmp.isEmpty()) {
				que.add(tmp.poll());
			}
			
		}
		while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(list[n]);
		}
	}
	static class Data {
		int num;
		int val;
		Data(int a, int b) {
			num = a;
			val = b;
		}
	}
}