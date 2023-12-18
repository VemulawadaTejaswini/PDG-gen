import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next())-1;
        int B = Integer.parseInt(sc.next())-1;

        char[][] map = new char[100][100];
        for (int i=0;i<100;i++) {
            for (int j=0;j<100;j++) {
                if (i<50) {
                    map[i][j]='.';
                } else {
                    map[i][j]='#';
                }
            }
        }

        loop:while (B>0) {
            for (int i=0;i<50;i+=2) {
                for (int j=0;j<100;j+=2) {
                    map[i][j]='#';
                    B--;
                    if (B==0) {
                        break loop;
                    }
                }
            }
        }
        loop:while (A>0) {
            for (int i=51;i<100;i+=2) {
                for (int j=0;j<100;j+=2) {
                    map[i][j]='.';
                    A--;
                    if (A==0) {
                        break loop;
                    }
                }
            }
        }

        for (int i=0;i<100;i++) {
            StringBuilder sb = new StringBuilder();
            for (int j=0;j<100;j++) {
                sb.append(map[i][j]);
            }
            System.out.println(sb);
        }
    }
}