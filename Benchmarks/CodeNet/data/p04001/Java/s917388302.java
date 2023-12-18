import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    /**
     * Iterate through each line of input.
     */
    long allSum = 0;
    char[] array;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        array = sc.next().toCharArray();
        solve();
    }

    void solve(){
        dfs(0, 0, 0);
        System.out.println(allSum);
    }

    void dfs(int pointer, long sum, long rem) {
        if (pointer == array.length - 1) {
            allSum += sum + Character.getNumericValue(array[pointer]) + rem * 10;
            return;
        }
        int num = Character.getNumericValue(array[pointer]);
        dfs(pointer + 1, sum + rem * 10 + num, 0);
        dfs(pointer + 1, sum, rem * 10 + num);
    }
}

class Dfs {
    long allSum = 0;
    char[] array;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        array = sc.next().toCharArray();
        solve();
    }

    void solve(){
        dfs(0, 0, 0);
        System.out.println(allSum);
    }

    void dfs(int pointer, long sum, long rem) {
        System.out.println(rem);
        if (pointer == array.length - 1) {
            allSum += sum + Character.getNumericValue(array[pointer]) + rem * 10;
            return;
        }
        int num = Character.getNumericValue(array[pointer]);
        dfs(pointer + 1, sum + rem * 10 + num, 0);
        dfs(pointer + 1, sum, rem * 10 + num);
    }
}