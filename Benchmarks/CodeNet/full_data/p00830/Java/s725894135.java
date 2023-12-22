import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Pathological Paths - Wrong Answer
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Main main = new Main();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N, M;
			N = parseInt(line.substring(0, line.indexOf(' ')));
			M = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((N | M) == 0) break;

			Dir root = main.new Dir("/");
			for (int i = 0; i < N; i++) {
				root.addFile(br.readLine());
			}
			for (int i = 0; i < M; i++) {
				String q1 = br.readLine();
				String q2 = br.readLine();
				if (root.abs(q1).equals("") || root.abs(q2).equals("")) {
					System.out.println("not found");
				} else if (root.abs(q1).equals(root.abs(q2))) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}

		} //end while
	} //end main

	class Dir {

		Dir parent;
		String name;
		Map<String, Dir> subdirs;
		Set<String> files;

		Dir(String name) {
			this.name = name;
			subdirs = new HashMap<>();
			files = new HashSet<>();
		}

		void addFile(String path) {
			String[] parts = path.split("/");
			Dir dir = this, parent = this;
			for (int i = 1; i < parts.length - 1; i++) {
				if (!dir.subdirs.containsKey(parts[i])) {
					dir.subdirs.put(parts[i], new Dir(parts[i]));
				}
				dir = dir.subdirs.get(parts[i]);
				dir.parent = parent;
				parent = dir;
			}
			dir.files.add(parts[parts.length - 1]);
		}

		String abs(String path) {

			Deque<String> abs = new ArrayDeque<>();
			abs.offer("/");

			String[] parts = path.split("/");
			Dir dir = this, parent = this;
			boolean isDir = true;

			for (int i = 1; i < parts.length; i++) {
				switch (parts[i]) {
					case "..":
						dir = dir.parent;
						if (dir != null) {
							abs.pollLast();
						} else {
							return "";
						}
						break;
					case ".":
						break;
					default:
						if (dir.subdirs.containsKey(parts[i])) {
							dir = dir.subdirs.get(parts[i]);
							abs.offer(parts[i] + "/");
						} else if (i == parts.length - 1
								&& path.charAt(path.length() - 1) != '/'
								&& !parts[parts.length - 1].equals(".")
								&& !parts[parts.length - 1].equals("..")) {
							if (dir.files.contains(parts[i])) {
								abs.offer(parts[i]);
								isDir = false;
							}
						} else {
							return "";
						}
				}
			}
			if (isDir) {
				if (dir.files.contains("index.html")) {
					abs.offer("index.html");
				} else {
					return "";
				}
			}
			//
			StringBuilder sb = new StringBuilder();
			for (String s : abs) sb.append(s);
			return sb.toString();
		}
	}
}