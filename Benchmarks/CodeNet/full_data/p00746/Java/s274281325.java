import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);

    static class square {
        int width;
        int height;
        
        square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        while (true) {
            int N = s.nextInt();
            if (N == 0) break;

            square[] data = new square[N];
            data[0] = new square(0, 0);
            int maxWidth=0;
            int minWidth=0;
            int maxHeight=0;
            int minHeight=0;

            for (int i = 1; i < N; i++) {
                int num = s.nextInt();
                int direction = s.nextInt();
                int width;
                int height;

                if (direction == 0) {
                    width = data[num].width - 1;
                    height = data[num].height;
                    data[i] = new square(width, height);
                    if(minWidth>width) minWidth=width;
                } else if (direction == 1) {
                    width = data[num].width;
                    height = data[num].height - 1;
                    data[i] = new square(width, height);
                    if(minHeight>height) minHeight=height;
                } else if (direction == 2) {
                    width = data[num].width + 1;
                    height = data[num].height;
                    data[i] = new square(width, height);
                    if(maxWidth<width) maxWidth=width;
                } else if (direction == 3) {
                    width = data[num].width;
                    height = data[num].height + 1;
                    data[i] = new square(width, height);
                    if(maxHeight<height) maxHeight=height;
                }
            }


            int ansWidth = maxWidth - minWidth + 1;
            int ansHeight = maxHeight - minHeight + 1;

            System.out.println(ansWidth + " " + ansHeight);
        }
    }


}