import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h;
        int w;
        
        while(true) {
            if (h == 0 || w == 0) {
                break;   
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.println("#");
                }
                System.out.println();
            }
        }
    }
}