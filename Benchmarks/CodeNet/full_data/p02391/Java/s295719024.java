import java.util.*;

public class Main{
    public static void main(String[] args){
  String[] lines = getStdin();
  
String[] str = lines[0].split(" ");
int a = Integer.parseInt(str[0]);
int b = Integer.parseInt(str[1]);
  
  if (a > b){
      System.out.println("a > b");
  } else if(a < b){
      System.out.println("a < b");
  } else if ( a == b){
      System.out.println("a == b");
  }
    }
    
    private static String[] getStdin() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();
    while (scanner.hasNext()) {
      lines.add(scanner.nextLine());
    }
    return lines.toArray(new String[lines.size()]);
  }
}
