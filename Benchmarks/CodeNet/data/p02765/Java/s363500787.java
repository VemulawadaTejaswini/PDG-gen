import java.util.Scanner;
class Main{
  public static void main(String[] args){
  	
    Scanner scan = new Scanner(System.in);
    
    int k = scan.nextInt();
    int r = scan.nextInt();
    int res = 0;
    
    if (k >= 10 ){
      res = k + r;
    }else if(k < 10){
      k = 100*(10-k);
      res = r + k;
    }
    
    System.out.println(res);
    
  }
}