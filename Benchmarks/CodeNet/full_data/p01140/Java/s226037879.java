import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
             int h, w;
             while((h = scn.nextInt()) > 0 | (w = scn.nextInt()) > 0) {
                 int[] heights = new int[h];
                 for(int i = 0; i < h; i++) {
                     heights[i] = scn.nextInt();
                 }

                 int[] widths = new int[w];
                 for(int i = 0; i < w; i++) {
                     widths[i] = scn.nextInt();
                 }

                 int sum = 0;
                 for(int i = 0; i < h; i++) {
                     for(int j = 0; j < w; j++) {
                         int height = 0;
                         for(int k = i; k < h; k++) {
                             height += heights[k];
                             int width = 0;
                             for(int l = j; l < w; l++) {
                                 width += widths[l];
                                 if(height == width) {
                                     sum++;
                                 }
                             }
                         }
                     }
                 }
                 System.out.println(sum);
             }
        }
    }
}