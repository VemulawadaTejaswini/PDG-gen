import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int cnt = 0;

    for(int i = a; i <= b; i++){
      String s = String.valueOf(i);
      boolean flag = true;
      for(int j = 0; j < s.length()/2; j++){
        if(s.charAt(j) != s.charAt(s.length()-j-1)){
          flag = false;
          break;
        }
      }
      if(flag){cnt++;}
    }

    System.out.println(cnt);

  }
}

/*
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String blank = sc.nextLine();
String s = sc.nextLine();
System.out.println();
System.exit(0)
*/
