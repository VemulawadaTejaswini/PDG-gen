package abc137;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// TODO
// TLEでNG
public class ABC137C {

public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b_in = sc.nextInt();
int b =2 * b_in;
  
int result = 0;
  
  if(b <= a){
    result = a - b;
  }
  
System.out.println(result);
}
}