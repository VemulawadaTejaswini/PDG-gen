import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.TreeSet;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        TreeSet<String> dictionary = new TreeSet();
        while (n-- > 0) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "insert":
                    dictionary.add(command[1]);
                    break;
                case "find":
                    bw.append(dictionary.contains(command[1]) ? "yes\n" : "no\n");
                    break;
            }
        }
        bw.flush();
    }

}
