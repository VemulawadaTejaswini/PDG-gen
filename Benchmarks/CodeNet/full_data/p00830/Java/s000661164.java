import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Dir root;

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			root = new Dir("", null);
			for (int i = 0; i < N; ++i) {
				String[] path = sc.next().split("/");
				Dir cur = root;
				for (int j = 1; j < path.length - 1; ++j) {
					cur = cur.addChild(path[j]);
				}
				cur.file.add(new File(path[path.length - 1]));
			}
			for (int i = 0; i < M; ++i) {
				File f1 = get((sc.next() + "$").split("/"));
				File f2 = get((sc.next() + "$").split("/"));
				if (f1 == null || f2 == null) {
					System.out.println("not found");
				} else {
					System.out.println(f1 == f2 ? "yes" : "no");
				}
			}
		}
	}

	static File get(String[] path) {
		String last = path[path.length - 1];
		path[path.length - 1] = last.substring(0, last.length() - 1);
		boolean def = false;
		if (path[path.length - 1].equals("")) {
			def = true;
			path[path.length - 1] = "index.html";
		}
		Dir cur = root;
		for (int i = 1; i < path.length - 1; ++i) {
			cur = cur.get(path[i]);
			if (cur == null) return null;
		}
		last = path[path.length - 1];
		for (File f : cur.file) {
			if (f.name.equals(last)) return f;
		}
		if (!def) {
			cur = cur.get(last);
			if (cur != null) {
				for (File f : cur.file) {
					if (f.name.equals("index.html")) return f;
				}
			}
		}
		return null;
	}

	static class Dir {
		String name;
		Dir parent;
		ArrayList<Dir> child = new ArrayList<Dir>();
		HashSet<File> file = new HashSet<File>();

		Dir(String n, Dir p) {
			name = n;
			parent = p;
		}

		Dir addChild(String cn) {
			for (Dir c : child) {
				if (c.name.equals(cn)) return c;
			}
			Dir ret = new Dir(cn, this);
			child.add(ret);
			return ret;
		}

		Dir get(String segment) {
			if (segment.equals(".")) {
				return this;
			} else if (segment.equals("..")) {
				return parent;
			}
			for (Dir c : child) {
				if (c.name.equals(segment)) return c;
			}
			return null;
		}
	}

	static class File {
		String name;

		File(String n) {
			name = n;
		}

		public int hashCode() {
			return name.hashCode();
		}

		public boolean equals(Object obj) {
			File other = (File) obj;
			return name.equals(other.name);
		}
	}
}