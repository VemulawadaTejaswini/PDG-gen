import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int bit = 0;
        int over = 0;
        int num;

        int buf;
        StringBuilder builder = new StringBuilder();
        while((buf = System.in.read()) != '\n') {}
        while (true) {
            builder.setLength(0);
            while((buf = System.in.read()) != ' ' && buf != '\n') {
                builder.appendCodePoint(buf);
            }

            num = Integer.parseInt(builder.toString()) / 400;
            if (num < 1) {
                bit |= 1;
            } else if (num < 2) {
                bit |= 2;
            } else if (num < 3) {
                bit |= 4;
            } else if (num < 4) {
                bit |= 8;
            } else if (num < 5) {
                bit |= 16;
            } else if (num < 6) {
                bit |= 32;
            } else if (num < 7) {
                bit |= 64;
            } else if (num < 8) {
                bit |= 128;
            } else {
                over++;
            }
            
            if (buf == '\n') break;
        }

        int count = Integer.bitCount(bit);
        int max = count + over;

        if (count == 0) count = 1;

        System.out.print(count + " " + max);
    }
}
