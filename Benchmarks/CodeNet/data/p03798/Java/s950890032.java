import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        int[] answers = new int[2*N];
        char[] animals = new char[2*N];
        for (int i=0;i<N;i++) {
            if (S.charAt(i)=='o') answers[i]=1;
        }
        answers[N]=answers[0];

        int flag = 0;
        StringBuilder sb = new StringBuilder();

        for (int j=0;j<4;j++) {
            if (j%2==0) animals[0]='S';
            else animals[0]='W';
            if (j/2==0) animals[1]='S';
            else animals[1]='W';
            for (int i=0;i<N;i++) {
                animals[i+2]=put_animal(animals[i], animals[i+1], answers[i+1]);
            }
            if (animals[N]==animals[0] && animals[N+1]==animals[1]) {
                flag=1;
                sb = new StringBuilder();
                for (int i=0;i<N;i++) {
                    sb.append(animals[i]);
                }
            }
        }

        if (flag==0) System.out.println(-1);
        else System.out.println(sb);
    }

    static char put_animal(char before, char center, int answer) {
        if (before=='S' && center=='S') {
            if (answer==1) return 'S';
            else return 'W';
        } else if (before=='S' && center=='W') {
            if (answer==1) return 'W';
            else return 'S';
        } else if (before=='W' && center=='S') {
            if (answer==1) return 'W';
            else return 'S';
        } else {
        // } else if (before=='W' && center=='W') {
            if (answer==1) return 'S';
            else return 'W';
        }
    }
}