import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    String[] str = scn.nextLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int max=0,min=1000*1000+1;
    int x,y;
    int min_x=1000,min_y=1000,max_x=0,max_y=0;
    String[] tmp;
    int a;
    for(int i=0;i<n;i++){
      tmp = scn.nextLine().split(" ");
      x=Integer.parseInt(tmp[0]);
      y=Integer.parseInt(tmp[1]);
      a=x*x+y*y;
      if(a>max){max=a;max_x=x;max_y=y;}
      if(a<min){min=a;min_x=x;min_y=y;}
      
    }
    int bx= max_x-min_x;
    int by= max_y-min_y;
    int b= bx*bx+by*by;
    
    System.out.println(Math.sqrt(b)/2);
  }
}