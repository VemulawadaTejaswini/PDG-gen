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

            for(int i=0; i<h; i++) {
                StringBuilder sb = new StringBuilder();
                for(int j=0; j<w; j++) {
                    if(i == 0 || i == h-1) {
                        sb.append("#");
                    } else if(j == 0 || j == w-1) {
                        sb.append("#");
                    } else if(j != 0 && j != w-1) {
                        sb.append(".");
                    }
                }
                System.out.println(sb);
            }
            System.out.println("");
        }
        sc.close();
    }
}

