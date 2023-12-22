//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        InputStream var1 = System.in;
        PrintStream var2 = System.out;
        Scanner var3 = new Scanner(var1);
        PrintWriter var4 = new PrintWriter(var2);
        Main.Task3 var5 = new Main.Task3();
        var5.solve(1, var3, var4);
        var4.close();
    }

    static class Task3 {
        Task3() {
        }

        public void solve(int var1, Scanner var2, PrintWriter var3) {
            int var4 = var2.nextInt();
            int[] var5 = new int[var4 + 1];
            long var6 = 0L;

            for(int var8 = 1; var8 <= var4; ++var8) {
                if (var8 == 1) {
                    ++var6;
                } else {
                    for(int var9 = var8; var9 <= var4; var9 += var8) {
                        int var10002 = var5[var9]++;
                    }

                    var6 += (long)(var8 * (var5[var8] + 1));
                }
            }

            var3.println(var6);
        }
    }
}
