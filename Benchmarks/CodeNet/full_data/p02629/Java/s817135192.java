import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();

    String name = "";
    String alphabet = "z";
    for(char c = 'a'; c < 'z'; c++){
      alphabet = alphabet + c;
    }

    for(int i=0; i<100; i++){
      int index = (int)(N % 26);
      name = alphabet.charAt(index) + name;

      N = N - index;
      if(N == 0){
        // name = alphabet.charAt((int)N) + name;
        System.out.println(name);
        return;
      }else{
        N = N/26;
      }
    }
    return;
  }
}