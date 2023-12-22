import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;

        StringBuilder builder = new StringBuilder();
        int buf;
        while ((buf = System.in.read()) != '\n') {}
        l: while (true) {
            builder.setLength(0);
            while ((buf = System.in.read()) != '\n') {
                if (buf == -1) break l;
                builder.appendCodePoint(buf);
            }

            switch (builder.toString()) {
                case "AC" :
                    ac++;
                    break;
                case "WA":
                    wa++;
                    break;
                case "TLE":
                    tle++;
                    break;
                case "RE":
                    re++;
                    break;
            }
        }

        System.out.println("AC x " + ac);
        System.out.println("WA x " + wa);
        System.out.println("TLE x " + tle);
        System.out.println("RE x " + re);
    }
}
