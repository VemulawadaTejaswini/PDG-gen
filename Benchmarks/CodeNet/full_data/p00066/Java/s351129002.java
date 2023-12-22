import java.util.*;

class Main {

    static char bingo (char[] line, int a1, int a2, int a3) {

        if (line[a1] == line[a2] && line[a2] == line[a3]) {
            return line[a1];
        }

        return '?';

    }

    static char solve (char[] line) {
        char res = 'd';
        for(int i = 0; i < 3; i++) {
            res = bingo(line, 3 * i, 3 * i + 1, 3 * i + 2);
            if (res == 'o' || res == 'x') {
                return res;
            }
            res = bingo(line, i, 3 + i, 6 + i);
            if (res == 'o' || res == 'x') {
                return res;
            }
        }

        res = bingo(line, 0, 4, 8);
        if (res == 'o' || res == 'x') {
            return res;
        }
        res = bingo(line, 2, 4, 6);
        if (res == 'o' || res == 'x') {
            return res;
        }
        
        return 'd';

    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            char res = solve(sc.nextLine().toCharArray());
            System.out.println(res);
        }

    }
}