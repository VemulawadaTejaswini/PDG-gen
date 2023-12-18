import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int bit = 0;
        int over = 0;
        int num;
        
        boolean gray = false;
        boolean brawn = false;
        boolean green = false;
        boolean sky = false;
        boolean blue = false;
        boolean yellow = false;
        boolean orange = false;
        boolean red = false;

        int buf;
        StringBuilder builder = new StringBuilder();
        while((buf = System.in.read()) != ' ' && buf != '\n') {
            ;;
        }
        while (true) {
            builder.setLength(0);
            while((buf = System.in.read()) != ' ' && buf != '\n') {
                builder.appendCodePoint(buf);
            }

            num = Integer.parseInt(builder.toString());
            if (num < 400) {
                gray = true;
                bit |= 1;
            } else if (num < 800) {
                brawn = true;
                bit |= 2;
            } else if (num < 1200) {
                green = true;
                bit |= 4;
            } else if (num < 1600) {
                sky = true;
                bit |= 8;
            } else if (num < 2000) {
                blue = true;
                bit |= 16;
            } else if (num < 2400) {
                yellow = true;
                bit |= 32;
            } else if (num < 2800) {
                orange = true;
                bit |= 64;
            } else if (num < 3200) {
                red = true;
                bit |= 128;
            } else {
                over++;
            }

            if (buf == '\n') break;
        }

        int count = Integer.bitCount(bit);
        count = 0;
        if (gray) count++;
        if (brawn) count++;
        if (green) count++;
        if (sky) count++;
        if (blue) count++;
        if (yellow) count++;
        if (orange) count++;
        if (red) count++;
        int max = count + over;

        if (count == 0) count = 1;
        if (max > 8) max = 8;

        System.out.print(count + " " + max);
    }
}
