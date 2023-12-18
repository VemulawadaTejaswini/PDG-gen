import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    for(int i=1;i<=3500;i++){
      for(int j=1;j<=3500;j++){
        long x = n*i*j;
        long y = 4*i*j-n*(i+j);
        if(y!=0&&x%y==0&&x/y>=1&&x/y<=3500){
          System.out.println(i+" "+j+" "+x/y);
          return;
        }
      }
    }
  }
}
