import java.io.*;
import java.util.Scanner;
public class Main{
  public static void main (String[ ] args){
    Scanner sc = new Scanner(System.in);
    int i=0,j=97,h=97;
    int [] S;
    S = new int[10000];
    while (sc.hasNextLine()) {
      String str = sc.nextLine();
      String str2 = str.toLowerCase();
      int k = str2.length();
      while(j<123){
        while(i<k){
          if(str2.charAt(i)==j){
            S[j]++;
          }
          i++;
        }
        j++;
        i=0;
      }
      j=0;
    } 
    while(h<123){
      System.out.printf("%c : %d\n",h,S[h]);
      h++;
    }
  }  
}