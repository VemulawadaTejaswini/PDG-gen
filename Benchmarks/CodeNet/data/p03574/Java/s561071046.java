import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.nextLine();
    String out = "";
    String[] str = new String[a+2];
    for(int i = 0; i < a+2; i++) {
      if(i == 0 || i == a+1) {
        str[i] = "";
        for(int j = 0; j < b+2; j++) {
          str[i] += " ";
        }
      } else
        str[i] = " " + sc.nextLine() + " ";
    }
    
    for(int i = 1; i < a+1; i++) {
      for(int j = 1; j < b+1; j++) {
        if(str[i].charAt(j) == '.') {
          int count = 0;
          if(str[i-1].charAt(j-1) == '#') {
            count++;
          }
          if(str[i-1].charAt(j) == '#') {
            count++;
          }
          if(str[i-1].charAt(j+1) == '#') {
            count++;
          }
          if(str[i].charAt(j-1) == '#') {
            count++;
          }
          if(str[i].charAt(j+1) == '#') {
            count++;
          }
          if(str[i+1].charAt(j-1) == '#') {
            count++;
          }
          if(str[i+1].charAt(j) == '#') {
            count++;
          }
          if(str[i+1].charAt(j+1) == '#') {
            count++;
          }
          out += count;
        }
        else if(str[i].charAt(j) == '#') {
          out += '#';
        }
      }
      out += "\n";
    }
    System.out.println(out);
  }
}
