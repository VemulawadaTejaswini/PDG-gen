import java.util.Scanner;

public class Main{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 sc.useDelimiter(",|\n");
  int w=0,n=0;
  int[] data=new int[30];
  w=sc.nextInt();
  n=sc.nextInt();
  for(int i=0;i<w;i++){
   data[i]=i+1;
  }
  for(int j=0;j<n;j++){
   int a=sc.nextInt();
   int b=sc.nextInt();
   int tmp=data[a-1];
   data[a-1]=data[b-1];
   data[b-1]=tmp;
  }
  for(int k=0;k<w;k++){
   System.out.println(data[k]);
  }
  }
}