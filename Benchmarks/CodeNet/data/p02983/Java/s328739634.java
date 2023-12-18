import java.util.Scanner;

public class Main{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
   	int L=sc.nextInt();
    int R=sc.nextInt();
    int length= R-L+1;
    int h[]=new int[length];
    int m=L;
    int min=2018;
    for(int n=0;n<length;n++){
      h[n]=m;
      m++;
    }

    for(int s1=0;s1<length-1;s1++){
      for(int s2=s1+1;s2<length;s2++){
        if(h[s1]*h[s2]%2019<min){
          min=h[s1]*h[s2]%2019;
        }
      }
    }

    System.out.println(min);



  }
}
