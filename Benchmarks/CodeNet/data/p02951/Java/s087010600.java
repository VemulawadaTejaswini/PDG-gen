import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println(Math.max(0,-s.nextInt()+s.nextInt()+s.nextInt()));
  }
}