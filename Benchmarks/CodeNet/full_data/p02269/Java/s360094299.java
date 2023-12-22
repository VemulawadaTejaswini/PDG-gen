import java.io.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    String dic[];
    dic=new String[1000000];
    int cnt=0;
    boolean flag;
    for(int i=0;i<a;i++){
      String order=sc.next();
      String word=sc.next();
      switch(order){
        case ("insert"):
          dic[cnt]=word;
          cnt++;
          break;
        case ("find"):
          flag=false;
          for(int j=0;j<cnt;j++){
            if(dic[j].equals(word)) flag=true;
          }
          if(flag) System.out.println("yes");
          else System.out.println("no");
          break;
      }
    }
  }
}

