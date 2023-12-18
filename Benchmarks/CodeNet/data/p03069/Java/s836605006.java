import java.util.*;
import java.lang.*;
import java.io.*;
 

public class Main {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
   int l = s.nextInt();
   s.nextLine();
  String wrd = s.nextLine();
  int count =0;
  for(int i=0; i<l-1; i++){
  	if(wrd.charAt(i) =='#' && wrd.charAt(i+1) =='.'){
  		count++;
  	}
  }
  
  System.out.print(count);
    }
}