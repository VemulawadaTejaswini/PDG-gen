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
            int[] boxBalls = new int[boxes+1];
            int possibility = 0;
            for(int i = 1; i < boxBalls.length; i++){
                boxBalls[i] = 1;
            }
            for(int i = 0; i < operations; i++){
                st = new StringTokenizer(buff_in.readLine());
                int pick = Integer.parseInt(st.nextToken());
                int put = Integer.parseInt(st.nextToken());
                boxBalls[pick] = boxBalls[pick]-1;
                boxBalls[put] = boxBalls[put]+1;
            }
            for(int i = 0; i < boxBalls.length; i++){
                if(boxBalls[i]!=0){
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
