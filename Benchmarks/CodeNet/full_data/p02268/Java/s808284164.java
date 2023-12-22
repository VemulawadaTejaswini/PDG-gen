import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Console {
    static Console instance;
    final BufferedReader reader;

    public static Console getInstance() {
        if (instance == null) {
            instance = new Console();
        }
        return instance;
    }
    
    public Console() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public int readInt() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public int[] readLineNumbers(int n) throws IOException {
        String[] numStrings = reader.readLine().split(" ");
        int[] result = new int[n];
        for (int i = 0;i < n;i++) {
            result[i] = Integer.parseInt(numStrings[i]);
        }
        return result;
    }
    
    public void output(int n) {
        System.out.println(n);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        int n = Console.getInstance().readInt();
        int[] S = Console.getInstance().readLineNumbers(n);
        int q = Console.getInstance().readInt();
        int[] T = Console.getInstance().readLineNumbers(q);
        
        int count = 0;
        for (int i = 0;i < q;i++) {
            int t = T[i];
            int min = 0;
            int max = n - 1;

            while (min <= max) {
                int index = (min + max) / 2;
                if (S[index] == t) {
                    count++;
                    break;
                } else if (min == max) {
                    // not found
                    break;
                } else if (S[index] > t) {
                    max = index - 1;
                } else if (S[index] < t) {
                    min = index + 1;
                }
            }
        }

        Console.getInstance().output(count);
    }
}