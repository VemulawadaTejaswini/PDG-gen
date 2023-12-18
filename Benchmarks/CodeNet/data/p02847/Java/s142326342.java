import java.util.Scanner;

public class Main {
  private String day[]={"SUN","MON","TUE","WED","THU","FRI","SAT"};
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s=sc.next();
      for(int i=0;i<7;i++){
        if(day[i]==s)
          System.out.println(7-i);
      }
      
    }
}