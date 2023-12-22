import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int s = scanner.nextInt();
     System.out.println((s/3600) + ":" + ((s%3600)/60) + ":" + (s%60));
  }
}
