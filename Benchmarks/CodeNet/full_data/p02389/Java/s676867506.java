import java.io.*;

class Rectangle {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(Sys
tem.in));

                String[] str = br.readLine().split(" ");

                int x = Integer.parseInt(str[0]);
                int y = Integer.parseInt(str[1]);
                System.out.println((x*y) + " " + (x+y)*2);
        }
}