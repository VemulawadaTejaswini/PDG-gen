import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
  	for(int i = 1;i <= x; i++){
  		if(i%3 == 0){
  			System.out.print(" "+i);
  		}else if(Integer.toString(i).contains("3")){
  			System.out.print(" "+i);
  		}
  	}
  	System.out.println("");
  }
}
