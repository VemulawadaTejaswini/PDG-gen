import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String SS=sc.nextLine();

    int count =0;
    int K=SS.length();
      for(int i=0;i<K/2;i++){
        if(SS.charAt(i)==SS.charAt(K-1-i)){
        count=count+0;
        }else if(SS.charAt(i)!=SS.charAt(K-1-i)){
          count=count+1;
        }
      }
    if(count!=0){
      System.out.println("count");
    }
    }
  }

          
          
