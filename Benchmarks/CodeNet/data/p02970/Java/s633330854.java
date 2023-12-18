import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();//14
	int d = sc.nextInt();//3
    
    int count = 0;
    int result = 0;
    
    for(int i = 0;i < n;i++){
      if(3*d*i >= n & count == 0){
        result = i;
        ++count;
      }
    }
    System.out.println(result);
  }
}