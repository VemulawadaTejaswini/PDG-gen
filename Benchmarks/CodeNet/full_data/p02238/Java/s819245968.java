
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] M = new int[n][n];

        //??????
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int k = sc.nextInt();
            for(int j = 0; j < k; j++) {
                int b = sc.nextInt();
                M[a - 1][b - 1] = 1;
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j > 0) System.out.print(" ");
                System.out.print(M[i][j]);
            }
            System.out.println();
        }
    }

}

class Stack {
    int top;
    int MAX = 100007;
    int[] S = new int[MAX];

    Stack() {
        top = 0;
    }
    boolean isEmpty() {
        return top == 0;
    }
    boolean isFull() {
        return top > MAX;
    }
    void push(int x) {
        if(isFull()) return;
        top++;
        S[top] = x;
    }
    int pop() {
        if(isEmpty()) return -1;
        top--;
        return S[top + 1];
    }
}
class P {
    String name;
    int time;
    P(String n, int t) {
        name = n;
        time = t;
    }
}