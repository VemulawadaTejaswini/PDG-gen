import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt()*2;
    int x=sc.nextInt();
    int y=sc.nextInt();
    int min=Integer.MAX_VALUE;
    for(int i=0;i<=100000;i++){
      min=Math.min(i*c+Math.max(x-i,0)*a+Math.max(y-i,0)*b,min);
    }
    System.out.println(min);
  }
}