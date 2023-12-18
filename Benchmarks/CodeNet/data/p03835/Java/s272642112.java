import java.util.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int s=sc.nextInt();
    int count=0;
    //for loop to traverse for 0 to k
    for (int x=0;x<=k;x++) {
      for(int y=0;y<=k;y++) {
        for(int z=0;z<=k;z++) {
          if(x+y+z==s) {
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}