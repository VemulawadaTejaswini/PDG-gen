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
                boolean isSharp = false;

                if(i % 2 == 0) {
                    sb.append("#");
                    isSharp = true;
                } else {
                    sb.append(".");
                }
                for(int j=1; j<w; j++) {
                    if(isSharp && j%2 != 0) {
                        sb.append(".");
                    } else if(isSharp && j%2 == 0){
                        sb.append("#");
                    } else if(!isSharp && j%2 != 0){
                        sb.append("#");
                    } else if(!isSharp && j%2 == 0){
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

