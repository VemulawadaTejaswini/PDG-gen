import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String str_num = br.readLine();
        int num = Integer.parseInt(str_num);
        String str_record = br.readLine();
        int count = 1;

        String[] record_array = str_record.split(" ");
        int[] record = new int[num];
        int[] result = new int[num];

        for(int i = 0; i < num; i++){
          record[i] = Integer.parseInt(record_array[i]);
        }

        for(int i = 0; i < num; i++){
          for(int j = 0; j < num; j++){
            if(count == record[j]){
              result[count-1] = j + 1;
              count++;
            }
          }
        }

        for(int i=0; i < num; i++){
          System.out.print(result[i] + " ");
        }
      }
    }
}