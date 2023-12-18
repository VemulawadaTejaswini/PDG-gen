import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String str_num = br.readLine();
        String str_record = br.readLine();
        int count = 1;

        String[] record_array = str_record.split(" ", 0);
        int[] record = new int[record_array.length];
        int[] result = new int[record_array.length];

        for(int i = 0; i < record_array.length; i++){
          record[i] = Integer.parseInt(record_array[i]);
        }

        for(int i = 0; i < record_array.length; i++){
          for(int j = 0; j < record_array.length; j++){
            if(count == record[j]){
              result[count-1] = j + 1;
              count++;
            }
          }

        }

        //System.out.println(Arrays.toString(result));
        System.out.println(result);
      }
    }
}