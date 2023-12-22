import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i, j, h, w;
        while(true){
            h = sc.nextInt();
            w = sc.nextInt();
            if(h == 0 && w == 0) break;
            for(int i = 0; i < h; i++){
                if(i == 0 || i == h - 1){
                    for(int j = 0; j < w; j++){
                        System.out.printf("#");
                    }
                }else
                {
                    System.out.printf("#");
                    for(int j = 1; j < w - 1; j++){
                        System.out.printf(".");
                    }
                    System.out.printf("#");
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
        sc.close();
    }
}
