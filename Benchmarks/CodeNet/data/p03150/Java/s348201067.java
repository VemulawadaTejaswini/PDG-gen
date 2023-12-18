import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] data = str.split("");

        String[] keyence = { "k", "e", "y", "e", "n", "c", "e" };

        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < keyence.length; i++) {
            if (data[x].equals(keyence[i])) {
                x++;
            } else {
                if (y == 0) {
                    x = x + (data.length - keyence.length) - 1;
                    y = 1;
                } else {
                    z = 1;
                    break;
                }
            }
        }

        if (z == 1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}