import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws NumberFormatException, IOException{
        InputStreamReader input = new InputStreamReader (System. in);
        BufferedReader buffer = new BufferedReader(input);

        PriorityQueue<Integer> quere = new PriorityQueue<Integer> (Collections.reverseOrder());
        while(true){
            String[] str = buffer.readLine().split(" ");
            if(str[0].equals("insert")){
                quere.add(Integer.parseInt(str[1]));
            }
            if(str[0].equals("extract")){
                System.out.println(quere.poll());
            }
            if(str[0].equals("end")){
                break;
            }
        }
    }
}

