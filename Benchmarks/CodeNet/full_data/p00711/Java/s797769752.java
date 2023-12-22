import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            if (w == 0 && h == 0) {
                break;
            }
            char[][] field = new char[h][];
            int ww = 0;
            int hh = 0;
            for (int i = 0; i < h; i++) {
                field[i] = sc.next().toCharArray();
                for (int j = 0; j < w; j++) {
                    if (field[i][j] == '@') {
                        ww = j;
                        hh = i;
                        field[i][j] = '.';
                    }
                }
            }
            Counter cn = new Counter();
            search(hh, ww, field, cn);
            sb.append(cn.count).append("\n");
        }
        System.out.print(sb);
    }
    
    static void search(int hh, int ww, char[][] field, Counter cn) {
        if (hh < 0 || hh >= field.length || ww < 0 || ww >= field[hh].length || field[hh][ww] != '.') {
            return;
        }
        cn.up();
        field[hh][ww] = '#';
        search(hh - 1, ww, field, cn);
        search(hh + 1, ww, field, cn);
        search(hh, ww - 1, field, cn);
        search(hh, ww + 1, field, cn);
    }
    
    static class Counter {
        int count = 0;
        
        public void up() {
            count++;
        }
    }
}

