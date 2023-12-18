import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader in_file = new FileReader("b&b.in");
            BufferedReader buff_in = new BufferedReader(in_file);

            FileWriter out_file = new FileWriter("b&b.out");
            BufferedWriter buff_out = new BufferedWriter(out_file);

            PrintWriter output = new PrintWriter(buff_out);

            StringTokenizer st = new StringTokenizer(buff_in.readLine());
            int boxes = Integer.parseInt(st.nextToken());
            int operations = Integer.parseInt(st.nextToken());
            boolean[] redPossible = new boolean[boxes+1];
            redPossible[1]= true;
            int[] boxBalls = new int[boxes+1];
            int possibility = 0;
            for(int i = 1; i < boxBalls.length; i++){
                boxBalls[i] = 1;
            }
            for(int i = 0; i < operations; i++){
                st = new StringTokenizer(buff_in.readLine());
                int pick = Integer.parseInt(st.nextToken());
                int put = Integer.parseInt(st.nextToken());
                if(redPossible[pick]==true){
                    redPossible[put]=true;
                }
                boxBalls[pick] = boxBalls[pick]-1;
                boxBalls[put] = boxBalls[put]+1;
                if(boxBalls[pick]==0){
                    redPossible[pick]=false;
                }
            }
            for(int i = 0; i < redPossible.length; i++){
                if(redPossible[i]!=false){
                    possibility++;
                }
            }

            output.println(possibility);

            buff_in.close();
            output.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
