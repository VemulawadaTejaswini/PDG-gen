import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
  public static void main(String args[] ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    String input = br.readLine();
    ArrayList<String> list = new ArrayList<String>();

    String word = "";
    String character = "";

    for (String s: input.split(" ")) {
      list.add(s);
    }

    int ls =  list.size();
    int max_w = 0;
    int max_c = 0;

    for (int i = 0; i < ls; i++) {
      int count = 0;
      int length = list.get(i).length();

      for (int j = 0; j < ls; j++) {
        if(list.get(i).equals(list.get(j))){
           count++;
         }
      }

      if(count > max_w){
        max_w = count;
      }

      if (length > max_c) {
        max_c = length;
      }
    }

    for (int i = 0; i < ls; i++) {
      int count = 0;
      int length = list.get(i).length();
      for (int j = 0; j < ls; j++) {
        if(list.get(i).equals(list.get(j))){
           count++;
         }
      }

      if(count == max_w){
        word = list.get(i);
      }

      if(length == max_c){
        character = list.get(i);
      }
    }
    System.out.println(word + " " + character);
  }
}