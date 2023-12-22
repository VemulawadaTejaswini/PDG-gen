import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main{
    public static void main(String[] a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int top1 = 0, top2 = 0, top3 = 0;

        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());
            int w;

            if (input > top1) {
		top3 = top2;
		top2 = top1;
		top1 = input;
            } else if (input > top2) {
		top3 = top2;
		top2 = input;
            } else if (input > top3) {
		top3 = input;
            }
        }

        System.out.println(top1 + "\n" + top2 + "\n" + top3);
    }
}