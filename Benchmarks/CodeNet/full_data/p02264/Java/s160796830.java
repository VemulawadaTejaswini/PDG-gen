
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int SENTINEL = 100000007;
    public static int MAX = 10007;
    public static int NIL = -1;

    public static int[] dp = new int[100];


    public static void main(String[] args) throws IOException {

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        P[] PP = new P[n];
        Queue<P> Q = new ArrayDeque<P>();

        for(int i = 0; i < n; i++) {
            PP[i] = new P(sc.next(), sc.nextInt());
            Q.offer(PP[i]);
        }

        int T = 0;
        while(!Q.isEmpty()) {
            P Process = Q.poll();
            if(Process.time <= q) {
                T += Process.time;
                System.out.print(Process.name + " " + T);
                System.out.println();
            }
            else {
                T += q;
                P newProcess = new P(Process.name, Process.time - q);
                Q.offer(newProcess);
            }
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