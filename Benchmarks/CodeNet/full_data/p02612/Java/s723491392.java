import java.io.*;
import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
    int input1 = scanner.nextInt();
    int input2 = input1 / 1000;
    input2 = input2 + 1;
    input2 = input2 * 1000;
    input1 = input2 - input1;
    
    System.out.println(input1);
  };
};