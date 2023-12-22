import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            if(h == 0 && w == 0) {
                break;
            }

            StringBuilder sb = new StringBuilder();

            for(int i=0; i<w; i++) {
                sb.append("#");
            }

            for(int i=0; i<h; i++) {
                System.out.println(sb);
            }

            System.out.println("");
        }
        sc.close();
    }
}

