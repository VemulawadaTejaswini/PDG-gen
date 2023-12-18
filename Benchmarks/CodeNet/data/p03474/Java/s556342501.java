/*
長さの制約を忘れていた
*/
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String blank = sc.nextLine();
    String s = sc.nextLine();
    int i = 0;
    boolean flag = true;

    if(s.charAt(a) != '-'){flag = false;}
    for(char c : s.toCharArray()){
      if(i == a){continue;}
      if(!('0' <= c) && !(c <= '9')){flag = false; break;}
      i++;
    }
    if(s.length() != a+b+1){flag = false;}

    if(flag){System.out.println("Yes");}
    else{System.out.println("No");}

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
