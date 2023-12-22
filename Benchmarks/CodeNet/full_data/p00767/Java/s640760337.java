import com.sun.tools.javac.util.List;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine().trim()) != null && !"0 0".equals(line)) {
            String[] hoge = line.split(" ");
            int seiseki[][] = new int[151][151];
            for(int i = 1 ; i < 150; i++) {
                for(int j = 2 ; j <= 150; j++) {
                    seiseki[i][j] = i*i + j*j;
                }
            }
            int a = Integer.parseInt(hoge[0]);
            int b = Integer.parseInt(hoge[1]);
            int calc = a*a + b*b;

            boolean flg = false;
            for(int i = 1 ; i < 150; i++) {
                for(int j = 2 ; j <= 150; j++) {
                    if(( calc + 1 == seiseki[i][j]
                            || calc + 2 == seiseki[i][j]
                            || calc + 3 == seiseki[i][j]
                            || calc + 4 == seiseki[i][j]
                            || calc + 5 == seiseki[i][j]) && !flg) {
                        System.out.println(i + " " + j);
                        flg = true;
                    }
                }
            }
        }
    }
}
