import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int abc = 0;
    int times = 0;
    for(int i=0;i<=a;i++){
      for(int j=0;j<=b;j++){
        for(int k=0;k<=c;k++){
          abc = a[i] + b[j] + c[k];
          if(abc == x){
            times++;
          }
        }
      }
    }
    System.out.println(times);
  }
}