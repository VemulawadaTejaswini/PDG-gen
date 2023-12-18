import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    System.out.println(func(b)^(~func(a-1)));
  }
  
    public static int func(int n){
      if(n<0) return 0;
      if(n>=0){
        if(n%4==0){
          return 0;
        }else if(n%4==1){
          return n;
        }else if(n%4==2){
          return 1;
        }else{
          return n^1;
        }
      }
    }
}
