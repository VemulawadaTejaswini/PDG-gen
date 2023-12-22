import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
  public static void main(String[] a){
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> alstr = new ArrayList<String>();
    while(sc.hasNext()){
      alstr.add(sc.next());
    }

    char[] chararray = null;
    int strlen = 0;

    for (String str : alstr) {
      for(int offset = 0; offset<26; offset++){
        chararray = str.toCharArray();
        strlen = str.length();
        for (int iter = 0; iter < strlen; iter++) {
          if(chararray[iter] < 'a' || 'z' < chararray[iter]) {
            continue;
          }
          chararray[iter]++;
          if(chararray[iter] > 'z') chararray[iter]-=26;
        }

        str = String.valueOf(chararray);
        String[] strarr = str.split(" ");
        if(Arrays.asList(strarr).contains("the") || Arrays.asList(strarr).contains("that") || Arrays.asList(strarr).contains("this")){
          System.out.println(str);
          break;
        }
      }
    }
  }
}