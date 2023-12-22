import java.io.*;

class Main{
  public static void main(String args[]){
    int a=0;
    for(int i=0;i<5;i++){
      if(Integer.parseInt(args[i]) == 0){
        a=i+1;        
      }
    }
    System.out.print(a);
  }
}