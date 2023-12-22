import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 0, h = 0;
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String n = br.readLine();
            String taro = n.substring(0, n.indexOf(' '));
            String hanako = n.substring(n.indexOf(' ') + 1);

            if ((taro.compareTo (hanako)) == 0) {
                t++;
                h++;
            } else if((taro.compareTo(hanako) > 0)) {
                t += 3;
            } else if((taro.compareTo(hanako) < 0)) {
                h += 3;
            }
        }
        System.out.println(t + " " + h);
    }
}