import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();//14
	int d = sc.nextInt();//3
    int result = 0;
    
    if(n == 1 || n == 2){
      System.out.println(1);
    }else{
    for(int i = 0;i < n;i++){
      if((2*d+1)*i >= n){
        result = i;
        break;
      }
    }
    System.out.println(result);
    }
  }
}