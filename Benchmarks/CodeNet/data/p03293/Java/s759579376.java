import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);

    String s=sc.next();
    String t=sc.next();

    StringBuffer sb=new StringBuffer(s);
    String dst =sb.reverse().toString();
    if(t.equals(dst)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }



	}
}
