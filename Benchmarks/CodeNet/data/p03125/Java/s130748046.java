import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int ans=0;
    if(b%a==0){
      ans=a+b;
    }else{
      ans=b-a;
    }
    System.out.println(ans);
  }
}
