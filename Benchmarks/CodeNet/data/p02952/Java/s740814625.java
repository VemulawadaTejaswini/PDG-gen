import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int remit[] = {9,900,90000};
    int judge = 0;

    if(n >= 10000){
        judge = 3;
    }else if(n >= 100){
        judge = 2;
    }else if(n < 99){
        judge = 1;
    }

    if(judge == 3){
        if(n == 100000){
            count += remit[0] + remit[1] + remit[2];
        }else{
            count += (n - 9999) + remit[0] + remit[1];
        }

    }else if(judge == 2){
        if(n >= 1000){
            count += remit[0] + remit[1];
        }else{
            count += (n - 99) + remit[0]; 
        }

    }else if(judge == 1){
        if(n >= 9){
            count += remit[0];
        }else{
            count = n;
        }
    }

    System.out.println(count);
  }
}