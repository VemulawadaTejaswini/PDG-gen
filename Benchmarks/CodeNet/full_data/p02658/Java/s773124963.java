import java.util.Scanner;

public class Main{

  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	long b = 1;
    int n = sc.nextInt();
    boolean bo = true;
    for(int i = 0; i < n; i++){
        b = b * sc.nextLong();
        if(b==0){
            System.out.print("0");
            bo = false;
            break;
        }
        else if(b > 1000000000000000000L){
            System.out.print("-1");
            bo = false;
            break;
        }
    }
    if(bo)
        System.out.print(b);
  }
}