import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int m = fs.nextInt();
		
		Room[] roomArr = new Room[n];
		int[] visitedRoomArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			roomArr[i] = new Room(i);
		}
		
		for(int i = 0; i < m; i++) {
			int a = fs.nextInt() - 1;
			int b = fs.nextInt() - 1;
			
			roomArr[a].pathList.add(b);
			roomArr[b].pathList.add(a);
		}
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		for(int firstPath : roomArr[0].pathList) {
//			System.out.println(String.format("room id :%d", firstPath));
			queue.add(firstPath);
			visitedRoomArr[firstPath] = 1;
			roomArr[firstPath].nextPath = 0;
		}
		
		while(!queue.isEmpty()) {
			int roomId = queue.poll();
//			System.out.println(String.format("room id :%d", roomId));
			for(int path : roomArr[roomId].pathList) {
				if(visitedRoomArr[path] == 1) {
					continue;
				}
//				System.out.println(String.format("path id :%d", path));
				visitedRoomArr[path] = 1;
				roomArr[path].nextPath = roomId;
				queue.add(path);
			}
		}
		
		for(int i = 1; i < n; i++) {
			if(visitedRoomArr[i] == 0) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
		for(int i = 1; i < n; i++) {
			System.out.println(roomArr[i].nextPath + 1);
		}
	}
	
	class Room {
		int id;
		ArrayList<Integer> pathList;
		int nextPath;
		
		Room(int id) {
			this.id = id;
			pathList = new ArrayList<>();
		}
	}

	

	public class FastScanner {

		BufferedReader reader;
		private StringTokenizer st;

		public FastScanner() {
			st = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			if (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(reader.readLine());
			}
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			st = null;
			String readLine = null;
			readLine = reader.readLine();
			return readLine;
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArr(int n) throws NumberFormatException, IOException {
			int[] retArr = new int[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}

		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}

		public void close() throws IOException {
			reader.close();
		}
	}

}
