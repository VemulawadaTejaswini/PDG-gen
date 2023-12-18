import java.util.*;
import java.lang.Math;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
	String[] xArray = new String[x.length()];
    int[] c = new int[xArray.length -2];
    
	for(int i = 0;i < x.length(); i++){
      xArray[i] = String.valueOf(x.charAt(i));
    }
    
    int scg = 753;
    for(int i = 0;i < xArray.length - 2;i++){
      c[i] = Math.abs(Integer.parseInt(xArray[i] + xArray[i + 1] + xArray[i + 2]) - sichigo);
    }
    
    int min = 1000;
    for(int i = 0; i < c.length;i++){
      min = Math.min(min,c[i]);
      System.out.println(min);
    }
  }
}