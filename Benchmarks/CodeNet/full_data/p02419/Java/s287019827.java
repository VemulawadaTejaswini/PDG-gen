import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine().toLowerCase();
        String str;
        int count = 0;
        int index, start;
        while (!(str = br.readLine()).equals("END_OF_TEXT")) {
            str = str.toLowerCase();
            start = 0;
            do {
                if ((index = str.indexOf(target, start)) == -1) break;
                count++;
                start = index + target.length();
            } while (start <= str.length() - target.length());
        }
        System.out.println(count);
    }
}