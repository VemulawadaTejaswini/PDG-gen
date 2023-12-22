import java.util.Scanner;

public class Main{
    void run(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if(h+w == 0) break;

            int minHeight = 1000;
            int minWidth = 1000;
            for(int height=1; height<=200; height++){
                for(int width=height+1; width<=200; width++){
                    if(compalableRectangles(h, w, height, width) == -1 && compalableRectangles(height, width, minHeight, minWidth) == -1){
                        minHeight = height;
                        minWidth = width;
                    }
                }
            }
            System.out.println(minHeight + " " + minWidth);
        }
    }

    int compalableRectangles(int h1, int w1, int h2, int w2){
        int c1 = h1*h1+w1*w1;
        int c2 = h2*h2+w2*w2;
        if(c2 < c1){
            return 1;
        }
        if(c1 < c2){
            return -1;
        }
        if(c1 == c2){
            if(h1 == h2){
                return 0;
            }
            if(h2 < h1){
                return 1;
            }
            if(h1 < h2){
                return -1;
            }
        }
        return -100;
    }
    public static void main(String[] args) {
        new Main().run();
    }
}