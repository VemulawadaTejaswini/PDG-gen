import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[][][] dorm = new int[4][3][10];
        
        int n = in.nextInt();

        //input
        for(int i = 0; i < n; i++){
            int bill = Integer.parseInt(in.next()), floor = Integer.parseInt(in.next()),
                room = Integer.parseInt(in.next()), value = Integer.parseInt(in.next());
            
            dorm[bill-1][floor-1][room-1] += value;
        }

        PrintWriter out = new PrintWriter(System.out);
        //output
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 10; k++){
                    out.printf(" %d", dorm[i][j][k]);
                }
                out.println();
            }
            if(i < 3){
                for(int j = 0; j < 20; j++)out.print('#');
                out.println();
            }
        }
        out.flush();
    }
}
