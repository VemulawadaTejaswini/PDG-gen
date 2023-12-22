import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void check(String[] data) {
        for (int i = 1; i < 14; i++) {
            if (data[i] == null) {
                System.out.printf("%s %d\n", data[0], i);
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // space ,clube, dia , heart
        String space[] = new String[14];
        String heart[] = new String[14];
        String clobe[] = new String[14];
        String dia[] = new String[14];

        space[0] = "S";
        heart[0] = "H";
        clobe[0] = "C";
        dia[0] = "D";
        // s,h,c,d
        try {
            int rep = Integer.parseInt(br.readLine());
            String data[] = new String[2];
            while (rep-- > 0) {
                data = br.readLine().split(" ");
                if (data[0].equals("S")) {
                    space[Integer.parseInt(data[1])] = "O";
                } else if (data[0].equals("H")) {
                    heart[Integer.parseInt(data[1])] = "O";
                } else if (data[0].equals("C")) {
                    clobe[Integer.parseInt(data[1])] = "O";
                } else if (data[0].equals("D")) {
                    dia[Integer.parseInt(data[1])] = "O";
                } else {
                    continue;
                }
            }
            check(space);
            check(heart);
            check(clobe);
            check(dia);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
