import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S=sc.next();
    String splits[]=S.split("");
    if(splits[2].equals(splits[3])&&splits[4].equals(splits[5])){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

        }
      }
