import java.util.Scanner;
class main{
  static int gcd_2(int a,int b){
    if(b > a){
      int tmp = a;
      a = b;
      b = tmp;
    }
    if(b == 0){
      return a;
    }
    return gcd_2(a,a%b);
  }
  
  static int gcd_3(int a,int b,int c){
    int x = gcd_2(a,b);
    return gcd_2(x,c);
  }
  
  static int sum_gcd(int number){
    int sum = 0;
    for(int i = 1;i < = number;i++){
      for(int j = 1;i <= number;j++){
        for(int k = 1;k <= number;k++){
          sum += gcd_3(i,j,k);
        }
      }
    }
    return sum;  
  }
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(sum_gcd(number));
  }
}
