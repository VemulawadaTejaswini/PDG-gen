import java.util.*;
import java.io.*;
class Main{
  public static void main(String[]args) {
      Scanner sc=new Scanner(System.in);
      int data[]=new int[3];
      for(int i=0;i<3;i++){
        data[i]=sc.nextInt();
      }
      for(int i=0;i<data.length;i++){
        for(int j=i+1;j<data.length;j++)
          if(data[i]>data[j]){
            int x=data[i];
            data[i]=data[j];
            data[j]=x;
          }
      }
      System.out.println(data[0]+" "+data[1]+" "+data[2]);
  }
}
