import java.util.Scanner;
class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int x = 0;
    for(int i = 1 ; i < n ; i++){
      if(i%3 == 0){

      }else if(i%5 == 0){

      }else{
        x += i;
      }
    }
    System.out.println(x);
  }
}
