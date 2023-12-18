import java.util.Scanner;
  class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int K = sc.nextInt();
      int i = 1;
      int cnt = 0;
      while(true){
        if( A%i == 0 && B%i==0){
          cnt++;
          if(cnt==K){
            System.out.println(cnt);
            break;
          }
        }
        i++;
      }
    
  }
}
