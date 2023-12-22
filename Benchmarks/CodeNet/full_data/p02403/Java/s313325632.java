
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            int h = scan.nextInt();
            int w = scan.nextInt();
            if (h==0 && w ==0) break;
            scan.nextLine();
            for (int i=0; i<h; i++) {
                for (int j=0; i<w; j++) {
                    sb.append("#");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}