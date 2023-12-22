import java.io.*;
import java.util.ArrayDeque;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<String> list = new ArrayDeque<String>();
        String[] input;

        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");

            if (input[0].equals("insert")) {
                list.addFirst(input[1]);
            } else if (input[0].equals("delete")) {
                list.remove(input[1]);
            } else if (input[0].equals("deleteFirst")) {
                list.removeFirst();
            } else {
                list.removeLast();
            }
        }

        StringBuilder sb = new StringBuilder("");
        sb.append(list.poll());
        for (String element: list) {
            sb.append(" ").append(element);
        }
        System.out.println(sb.toString());
    }
}