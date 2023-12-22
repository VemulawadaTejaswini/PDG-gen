import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        PrintWriter out = new PrintWriter(System.out);
        while(true){
            int height = Integer.parseInt(in.next()), width = Integer.parseInt(in.next());
            
            if(height == 0 && width == 0) break;

            draw_rect(height, width, out);
        }

        out.flush();
    }

    static void draw_rect(int height, int width, PrintWriter out){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)){
                    out.print("#");
                }
                else out.print(".");
            }
            out.println();
        }
        out.println();
    }
}
