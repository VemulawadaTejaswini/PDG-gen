import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int sheep = sc.nextInt();
          int wolf = sc.nextInt();
          if(sheep <= wolf){
          System.out.println("unsafe");
        } else {
          System.out.println("safe");
        }
          }
  }