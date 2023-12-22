import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			String command = str[0];
			if (command.equals("insert")) {
				l.addFirst(Integer.parseInt(str[1]));
			} else if (command.equals("deleteFirst")) {
				l.removeFirst();
			} else if (command.equals("deleteLast")){
				l.removeLast();
			} else if (command.equals("delete")) {
				l.removeFirstOccurrence(Integer.parseInt(str[1]));
			} else {
				throw new IllegalArgumentException();
			}
		}

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        sb.append(l.poll());
        for (Integer s : l) {
            sb.append(" ");
            sb.append(s);
        }
        bw.write(sb.toString());
        bw.newLine();
        bw.close();

		br.close();
	}

}

