import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int taroScore = 0, hanakoScore = 0;
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] st = br.readLine().split(" ");
            String taro = st[0];
            String hanako = st[1];
            Integer comp = taro.compareTo(hanako);
            if (comp > 0) {
                taroScore += 3;
            } else if (comp < 0) {
                hanakoScore += 3;
            } else {
                taroScore++;
                hanakoScore++;
            }
        }
        bw.append(taroScore + " " + hanakoScore + "\n");
        bw.flush();
    }
}
