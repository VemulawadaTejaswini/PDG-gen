import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String[] list = new String[N];
        int answer = 0;
        int firstmatchcount = 0;
        int lastmatchcount = 0;
        int bothmatchcount = 0;
        for (int i = 0; i < N; i++) {
            String temp = scan.next();
            list[i] = temp;
            char[] data = temp.toCharArray();
            if (data[0] == 'B' && data[data.length-1] != 'A') {
                firstmatchcount += 1;
            }
            if (data[0] != 'B' && data[data.length-1] == 'A') {
                lastmatchcount += 1;
            }
            if (data[0] == 'B' && data[data.length - 1] == 'A') {
                bothmatchcount += 1;
            }
            answer += countAB(data);
        }
        int add = 0;
        if (bothmatchcount == 0) {
            add = Math.min(firstmatchcount, lastmatchcount);
        } else {
            if (0 == Math.min(firstmatchcount, lastmatchcount)) {
                add = bothmatchcount - 1;
            } else {
                add = bothmatchcount + Math.min(firstmatchcount, lastmatchcount);
            }
        }
        answer += add;
        System.out.println(answer);
    }
    private static int countAB(char[] data) {
        int count = 0;
        boolean foundA = false;
        for(char c : data) {
            if (c == 'A') {
                foundA = true;
                continue;
            }
            if (!foundA) {
                continue;
            }
            if (c == 'B') {
                count += 1;
            }
            foundA = false;
        }
        return count;
    }
}
