import java.util.Scanner;

public final class Main {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                int sx = s.nextInt();
                int sy = s.nextInt();
                int tx = s.nextInt();
                int ty = s.nextInt();

                int dx = tx-sx;
                int dy = ty-sy;

                boolean fx = dx > 0;
                boolean fy = dy > 0;

                // s to t
                if (fy) repeat ('U', dy);
                else repeat('D', dy);

                if (fx) repeat ('R', dx);
                else repeat('L', dx);

                // t to s
                if (fy) repeat ('D', dy);
                else repeat('U', dy);

                if (fx) repeat ('L', dx+1);
                else repeat('R', dx+1);

                // s to t again
                if (fy) repeat ('U', dy+1);
                else repeat('D', dy+1);

                if (fx) repeat ('R', dx+1);
                else repeat ('L', dx+1);
                if (fy) repeat ('D', 1);
                else repeat ('U', 1);

                // t to s again
                if (fx) repeat('R', 1);
                else repeat('L', 1);

                if (fy) repeat('D', dy+1);
                else repeat('U', dy+1);

                if (fx) repeat('L', dx+1);
                else repeat('R', dx+1);

                if (fy) repeat('U', 1);
                else repeat('D', 1);

                System.out.println();
        }

        public static void repeat(char c, int n) {
                for (int i=0; i<n; i++)
                        System.out.print(c);
        }
}
