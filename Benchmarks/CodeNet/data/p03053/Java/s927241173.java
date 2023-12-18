import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 2);
		int h = Integer.parseInt(first[0]);
		int w = Integer.parseInt(first[1]);
		boolean[][] field = new boolean[h][w];
		ArrayDeque<Integer> deq = new ArrayDeque<>();
		for (int i = 0; i < h; i++) {
		    char[] arr = br.readLine().toCharArray();
		    for (int j = 0; j < w; j++) {
		        field[i][j] = (arr[j] == '#');
		        if (field[i][j]) {
		            deq.add(i * w + j);
		        }
		    }
		}
		ArrayDeque<Integer> next = new ArrayDeque<>();
		int count = 0;
		while (deq.size() > 0) {
		    count++;
		    while(deq.size() > 0) {
		        int i = deq.poll();
		        int y = i / w;
		        int x = i % w;
		        if (y > 0 && !field[y - 1][x]) {
		            next.add((y - 1) * w + x);
		            field[y - 1][x] = true;
		        }
		        if (y < h - 1 && !field[y + 1][x]) {
		            next.add((y + 1) * w + x);
		            field[y + 1][x] = true;
		        }
		        if (x > 0 && !field[y][x - 1]) {
		            next.add(y * w + x - 1);
		            field[y][x - 1] = true;
		        }
		        if (x < w - 1 && !field[y][x + 1]) {
		            next.add(y * w + x + 1);
		            field[y][x + 1] = true;
		        }
		    }
		    ArrayDeque<Integer> tmp = next;
		    next = deq;
		    deq = tmp;
		}
		System.out.println(count - 1);
    }
}

