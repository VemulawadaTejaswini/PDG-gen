import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int k=scan.nextInt();
    int count=0;
    for(int i=1;i<=a;i++){
      if((a%i==0)&&(b%i==0)) count++;
      if(count==k){
        System.out.println(i);
        i=a+1;
      }
    }
  }
}
