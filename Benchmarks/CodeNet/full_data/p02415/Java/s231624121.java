import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] str = sc.nextLine().split(" ");
    for(int i = 0; i < str.length; i++) {
      String[] word = str[i].split("");
      String s = "";
      for(int j = 0; j < word.length; j++) {
        if(word[j].matches("[a-z]")) {
          s += word[j].toUpperCase();
        } else if(word[j].matches("[A-Z]")) {
          s += word[j].toLowerCase();
        } else {
          s += word[j];
        }
      }
      str[i] = s;
      if(i == str.length - 1) {
        System.out.println(str[i]);
      } else {
        System.out.print(str[i] + " ");
      }
    }
  }
}

