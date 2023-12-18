class main{
import java.util.Scanner;

  public static void main(String[] args(){
   Scanner scan = new Scanner(System.in);
	System.out.println("年齢を入力してください。");
    int X=scan.nextInt();
    if(X==3 || X==5||X==7){
    	System.out.println("yes");
    }else{
    	System.out.println("No");
    }
  }
}