import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstLine = in.readLine().split(" ");
		int H = Integer.parseInt(firstLine[0]);
		int W = Integer.parseInt(firstLine[1]);
		boolean[][] grid = new boolean[H][W];
		Queue<Integer> bfs = new LinkedList<Integer>();
		
		for (int i = 0; i < H; i++) {
			String nextLine = in.readLine();
			for (int j = 0; j < nextLine.length(); j++) {
				if (nextLine.charAt(j) == '#') {
					bfs.add(i + (j << 10));
				}
			}
		}
		
		int currentGeneration = 0;
		int iMask = 0b0000000000000000_0000001111111111;
		int jMask = 0b0000000000001111_1111110000000000;
		int genMask = 0b0111111111110000_0000000000000000;
		
		while (!bfs.isEmpty()) {
			int next = bfs.poll();
			//System.out.println(next + " " + (next & iMask) + " " + ((next & jMask) >> 10) + " " + ((next & genMask) >> 21));
			if (grid[next & iMask][(next & jMask) >> 10]) {
				continue;
			}
			grid[next & iMask][(next & jMask) >> 10] = true;
			currentGeneration = (next & genMask) >> 21;
			
			if ((next & iMask) >= 1 && (next & iMask) < H) {
				int left = ((next & iMask) - 1) + (next & jMask) + ((next & genMask) + (1 << 21));
				bfs.add(left);
			}
			
			if ((next & iMask) >= 0 && (next & iMask) < H - 1) {
				int right = ((next & iMask) + 1) + (next & jMask) + ((next & genMask) + (1 << 21));
				bfs.add(right);
			}
			
			if (((next & jMask) >> 10) >= 1 && ((next & jMask) >> 10) < W) {
				int up = (next & iMask) + ((((next & jMask) >> 10) - 1) << 10) + ((next & genMask) + (1 << 21));
				bfs.add(up);
			}
			
			if (((next & jMask) >> 10) >= 0 && ((next & jMask) >> 10) < W - 1) {
				int down = (next & iMask) + ((((next & jMask) >> 10) + 1) << 10) + ((next & genMask) + (1 << 21));
				bfs.add(down);
			}
		}
		
		System.out.println(currentGeneration);
	}
}
