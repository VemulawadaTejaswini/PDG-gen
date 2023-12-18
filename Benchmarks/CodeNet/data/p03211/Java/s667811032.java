import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x = sc.nextline();
	int l = x.length();
    int y[] = new int[l - 2];
    int c[] = new int[l - 2];
    for(int i = 0;i < l - 2;i++){
      y[i] = Integer.parseInt(x.substring(i,i+2));
    }
    
    int sichigo = 753;
    for(int i = 0;i < y.length;i++){
      c[i] = Math.abs(y[i] - sichigo);
    }
    
    int min = 1000;
    for(int i = 0; i < c.length;i++){
      min = Math.min(min,c[i]);
      System.out.println(min);
    }
  }
}