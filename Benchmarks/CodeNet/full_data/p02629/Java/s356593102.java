import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            long N = in.nextLong();
            Map<Character, Character> map = new HashMap<>();
            init(map);
            String s = Long.toString(N, 26);
            out.println(transform(s, map));
        }

        private String transform(String s, Map<Character, Character> map)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++)
            {
                sb.append(map.get(s.charAt(i)));
            }
            return sb.toString();
        }

        private void init(Map<Character, Character> map)
        {
            map.put('1', 'a');
            map.put('2', 'b');
            map.put('3', 'c');
            map.put('4', 'd');
            map.put('5', 'e');
            map.put('6', 'f');
            map.put('7', 'g');
            map.put('8', 'h');
            map.put('9', 'i');
            map.put('a', 'j');
            map.put('b', 'k');
            map.put('c', 'l');
            map.put('d', 'm');
            map.put('e', 'n');
            map.put('f', 'o');
            map.put('g', 'p');
            map.put('h', 'q');
            map.put('i', 'r');
            map.put('j', 's');
            map.put('k', 't');
            map.put('l', 'u');
            map.put('m', 'v');
            map.put('n', 'w');
            map.put('o', 'x');
            map.put('p', 'y');
            map.put('q', 'z');
        }

    }
}

