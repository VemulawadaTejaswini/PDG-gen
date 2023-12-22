import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        int h, w;
        MainRoop : while(true){
            h = sc.nextInt();
            w = sc.nextInt();
            if(h == 0 && w == 0)break MainRoop;
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++)System.out.print("#");
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
  
}
