import java.io.*;
public class Main {
    private static MyScanner scanner;

    public static void main (String[] args){
        Main instance = new Main();
        scanner = instance.new MyScanner();
        instance.solve();
    }

    private void solve() {
        try {
            String line = scanner.next();
            int zIndex = line.length();
            String letter = line.substring(zIndex-1, zIndex);
            while (!letter.equals("Z") && zIndex > 0) {
                zIndex--;
                letter = line.substring(zIndex-1, zIndex);
            }
            letter = line.substring(0, 1);
            int aIndex = 0;
            while (!letter.equals("A") && aIndex < line.length()) {
                aIndex++;
                letter = line.substring(aIndex, aIndex+1);
            }
            if (aIndex < zIndex) {
                System.out.println(zIndex - aIndex);
            } else {
                System.out.println("0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";

        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String line = br.readLine();
            while (line.equals("")) {
                line = br.readLine();
            }
            s = line.split(reg, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }

        public long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }
    }
}