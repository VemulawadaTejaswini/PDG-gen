import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String S=sc.next();
    
    String[]sr=S.split("");
    
    int count =0;
    
    if(S.length!=1){
      for(int i=0;i<5/2;i++){
        if(sr[i]==sr[5-i]){
          count+=0;
        }else if(sr[i]!=sr[5-i]){
          count+=1;
          sr[i]=sr[5-i];
        }
      }
    }
          if(S.length=1){
      System.out.println("0");
    }
    if(count!=0){
      System.out.println("count");
    }

    }
  }

          
          
