import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    int i = 0;
    
    String input = reader.next(); // Scans the next token of the input as an int.
    String current = "";
    
    //for(i=0;i<200000;i++){
      //if(!input.contains("ST")) break;     
    while(input.contains("ST")) {
      input = input.substring(i);
      current = input;
      i++;
    }
    //System.out.println(current);
    if(current.isEmpty()) System.out.println(0);
    else System.out.println(current.length()+1);
  }
}