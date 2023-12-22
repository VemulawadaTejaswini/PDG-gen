import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private class Vector<E> {

		private Object[] a = new Object[10];
		private int size = 0;
		
		private void add(E element) {
			if (size + 1 > a.length) {
				expand();
			}
			a[size] = element;
			size++;
		}
		
		private void expand() {
			Object[] tmp = new Object[size*2];
			for (int i = 0; i < a.length; i++) {
				tmp[i] = a[i];
			}
			a = tmp;
		}

		@SuppressWarnings("unchecked")
		private E get(int i) {
			return (E)a[i];
		}
		
		@SuppressWarnings("unchecked")
		private E pop() {
			E element = (E)a[size-1];
			a[size-1] = null;
			size--;
			return element;
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	public void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Vector<Integer> vector = new Vector<Integer>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int cmd = Integer.parseInt(st.nextToken());
			if (cmd == 0) {
				vector.add(Integer.parseInt(st.nextToken()));
			} else if (cmd == 1) {
				System.out.println(vector.get(Integer.parseInt(st.nextToken())));
			} else if (cmd == 2) {
				vector.pop();
			}
		}
		reader.close();
	}
}

