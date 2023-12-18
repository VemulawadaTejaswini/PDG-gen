import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        List<String> list_1 = new ArrayList<>();
        List<String> list_2 = new ArrayList<>();
        String str_1 = br.readLine();
        String str_2 = br.readLine();

        list_1 = stringToList(str_1);
        list_2 = stringToList(str_2);
      
        if(list_1.get(0).equals(list_2.get(0))){
          System.out.println("0");
        }else{
          System.out.println("1");
        }
      }
    }

    // stringToList
    public static List<String> stringToList(String str){
      return Arrays.asList(str.split(" "));
    }
}