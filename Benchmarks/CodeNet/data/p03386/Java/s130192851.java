import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int k = scan.nextInt();

    if(b-a+1 <= 2*k){
      for(int i=a; i<=b; i++){
        System.out.println(i);
      }
    }else{
      for(int i=a; i<a+k; i++){
        System.out.println(i);
      }
      for(int j=b-k+1; j<=b; j++){
        System.out.println(j);
        }
    }
  }
}
