
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data;
        char tmp;
        int num, input;
        Queue<Character> q = new LinkedList<Character>();

        try {
            while (!(data = br.readLine()).equals("-")) {
                for (int i = 0; i < data.length(); i++)
                    q.offer(data.charAt(i));
                num = Integer.parseInt(br.readLine());
                for (int i = 0; i < num; i++) {
                    input = Integer.parseInt(br.readLine());
                    for (int j = 0; j < input; j++) {
                        tmp = q.poll();
                        q.offer(tmp);
                    }
                }
                while (!q.isEmpty())
                    System.out.print(q.remove());
                System.out.print("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
