import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();
    int count = 0;

    for(int i=0; i<len; i++){
      long sum = 0;
      for(int j=i+1; j<len+1; j++){
      //インデックスiからj番目まで
        String ss = s.substring(i, j);
        sum = Long.parseLong(ss);
        if(sum%(long)2019==0){
          count++;
        }

      }
    }

    System.out.println(count);







  }
}