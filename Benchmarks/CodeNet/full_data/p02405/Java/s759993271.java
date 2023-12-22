import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h, w;
        String input[] = new String[2];
        while (true) {
            try {
                input = br.readLine().split(" ");
                if (input[0].equals("0") && input[1].equals("0"))
                    return;
                h = Integer.parseInt(input[0]);
                w = Integer.parseInt(input[1]);

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if ((i + j) % 2 == 0)
                            sb.append("#");
                        else
                            sb.append(".");
                    }
                    sb.append("\n");
                }
                System.out.println(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
