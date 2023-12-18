import java.util.Scanner;
class Test{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
 	int s = sc.nextInt();
    int w = sc.nextInt();
    
    if(w>=s){
 	 System.out.println("unsafe");
    }else if(s>w){
     System.out.println("safe");
    }
  }
}