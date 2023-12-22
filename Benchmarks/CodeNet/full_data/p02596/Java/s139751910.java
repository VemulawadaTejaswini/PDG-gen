import java.util.Scanner;

class Main{
  public static void main(String[] args){
  	Scanner scanner = new Scanner(System.in);

	int num1= scanner.nextInt();
    
    double fig=7;
    int count=1;
    
    while(true) {
      if((double)(fig%num1)==0.0) break;
      fig = (fig * 10)+ 7;
      count++;
      }
    
    System.out.println(count);
    
  }
}