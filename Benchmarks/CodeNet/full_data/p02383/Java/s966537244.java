import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int n = 0;
        int[] diceList = new int[6];
        while (n < lines.length) {
            diceList[n] = Integer.parseInt(lines[n++]);
        }
        Dice d = new Dice(diceList);
        String order = br.readLine();
        for(char c:order.toCharArray()){
            d.roll(c);
        }
        System.out.println(d.x[0]);
    }

}

class Dice {
    int[] dimension = new int[6];
    int[] y = new int[5];
    int[] x = new int[5];

    Dice(int[] d) {
        this.dimension = d;
        x = new int[] { d[0], d[2], d[5], d[3], d[0] };
        y = new int[] { d[0], d[1], d[5], d[4], d[0] };
    }

    void roll(char n) {
        switch (n) {
        case 'N':
            for (int i = 0; i < 5; i++) {
                y[i] = y[(i + 1) % 5];
            }
            break;
        case 'E':
            for (int i = 3; i >= -1; i--) {
                x[i + 1] = x[(i + 5) % 5];
            }
            break;
        case 'S':
            for (int i = 3; i >= -1; i--) {
                y[i + 1] = y[(i + 5) % 5];
            }
            break;
        case 'W':
            for (int i = 0; i < 5; i++) {
                x[i] = x[(i + 1) % 5];
            }
            break;
        }
        if(n=='N'||n=='S'){
            x[0] = y[0];
            x[2] = y[2];
        }else{
            y[0] = x[0];
            y[2] = x[2];
        }
    }
}