package suanfa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class candle {
    static int N, K;
    static LinkedList<Integer> positive;
    static Stack<Integer> negative;
    static int num = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inStr = br.readLine().split(" ");
        N = Integer.parseInt(inStr[0]);
        K = Integer.parseInt(inStr[1]);
        positive = new LinkedList<>();
        negative = new Stack<>();
        inStr = br.readLine().split(" ");
        int input;
        for (int i = 0; i < N; i++) {
            input = Integer.parseInt(inStr[i]);
            if (input > 0) {
                positive.add(input);
            } else {
                negative.push(-1 * input);
            }
        }
//        while (!positive.isEmpty()){
//            System.out.print(positive.poll() + " ");
//        }
//        System.out.println();
//        while (!negative.isEmpty()){
//            System.out.print(negative.pop() + " ");
//        }
        if (negative.isEmpty() || positive.isEmpty()) {
            if (negative.isEmpty() && positive.isEmpty()) {
                num = 0;
            } else {
                num = negative.isEmpty() ? positive.get(K - 1) : negative.get(K - 1);
            }
            System.out.println(num);
            return;
        }
//        int n = 0, p = 0;
//        while (n + p <= K) {
//            for (int i = 0; i < K; i++) {
//
//            }
//        }
        int left = negative.peek();
        int right = positive.peek();
        if (left == right) {

        }
    }
}
//5 3
//-30 -10 10 20 50
//40
//-------------
//3 2
//10 20 30
//20
//--------------
//1 1
//0
//0
//--------------
//8 5
//-9 -7 -4 -3 1 2 3 4
//10
