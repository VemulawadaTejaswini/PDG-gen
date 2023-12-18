import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.util.*;

public class Main {

    public static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next().trim();
        char arr[] = new char[27];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        Solver solver = new Solver();
        solver.solve(arr);
        System.out.println(output);
    }

}

class Solver {
    public void solve(char arr[]) {
        String ans = "Yes";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                ans = "No";
                break;
            }
        }
        Main.output.append(ans);
    }
}