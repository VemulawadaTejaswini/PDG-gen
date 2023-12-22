import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  int n = scan.nextInt();
  int numbers[];
  int temp;
  for(int i=0;i<n;i++){
    numbers[i] = scan.nextInt();
  }
  for(int j=0;j<n/2;j++){
    temp = numbers[j];
    numbers[j] = numbers[n-j-1];
    numbers[n-j-1] = temp;
  }
  }
}