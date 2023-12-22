import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        int S = Integer.parseInt(line);
        if (S >= 0 && S < 86400) {
            int hour = S / 3600;
            S %= 3600;
            int minute = S / 60;
            int second = S % 60;
            System.out.println(hour + ":" + minute + ":" + second);
        }
    }
}