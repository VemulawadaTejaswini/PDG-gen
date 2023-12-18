import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public  static void main(String[] args) {
        FastScanner sc = new FastScanner();

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int num1;
        int num2;
        int min;
        List<Integer> dame = new ArrayList<>();

        int[] height = new int[N];
        for (int i = 0; i < N; i++) {
            height[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < M; i++) {
            num1 = Integer.parseInt(sc.next());
            num2 = Integer.parseInt(sc.next());
            if (height[num1 - 1] < height[num2 - 1]) {
                dame.add(num1);
            } else if (height[num1 - 1] > height[num2 - 1]) {
                dame.add(num2);
            } else {
                dame.add(num1,num2);
            }
        }
        List<Integer> listB = new ArrayList<Integer>(new HashSet<>(dame));

        System.out.println(N - listB.size());
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
}