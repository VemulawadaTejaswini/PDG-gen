import java.util.Scanner;
import java.io.*;

class Solution{
public static void main(String args[]){
  
  Scanner s =  new Scanner(System.in);
  int n = s.nextInt();
  int ret = 0 ;
  ret += (n / 500)*1000;
  n = n / 500;
  ret += (n / 5) * 5;
  
}

}