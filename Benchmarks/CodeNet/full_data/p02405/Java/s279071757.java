import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            for (int i = 0; i < a; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < b; j++) {
                        bw.append(j % 2 == 0 ? "#" : ".");
                    }
                } else {
                    for (int j = 0; j < b; j++) {
                        bw.append(j % 2 == 0 ? "." : "#");
                    }
                }
                bw.newLine();
            }
            bw.newLine();
        }
        bw.flush();
    }


}

