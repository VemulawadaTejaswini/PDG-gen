import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    String[] str = scn.nextLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int max=0,x,y;
    String[] tmp;
    for(int i=0;i<n;i++){
      tmp = scn.nextLine().split(" ");
      x=Integer.parseInt(tmp[0]);
      x*=x;
      y=Integer.parseInt(tmp[1]);
      y*=y;
      if(x+y>max) max=x+y;
    }
    System.out.println(Math.sqrt(max)/2);
  }
}