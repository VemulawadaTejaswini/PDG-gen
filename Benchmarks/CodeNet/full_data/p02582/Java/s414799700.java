import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          String S = sc.next();
      	int ANS = 0;
      	for (int i = 0; i < 3;i++){
          if (S.charAt(i) == 'R'){
            ANS += 1;
          }
        }
      System.out.println(ANS);
    }
}
