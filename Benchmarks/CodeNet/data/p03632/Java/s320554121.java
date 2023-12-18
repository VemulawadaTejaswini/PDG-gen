package main.tasks;

import lib.io.MyInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, MyInput in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int x = Math.max(Math.min(b,d)-Math.max(a,b), 0);
        out.println(x);
    }
}
