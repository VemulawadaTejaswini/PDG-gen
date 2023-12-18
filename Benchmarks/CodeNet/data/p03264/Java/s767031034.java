import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    
    if(input % 2 == 0) System.out.println(input * input / 4);
    else System.out.println((int)(input/2) * (input+1)/2);
  }
}