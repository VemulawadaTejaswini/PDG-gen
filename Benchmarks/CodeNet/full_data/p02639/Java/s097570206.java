import java.util.Scanner;
class Main{
  public static void main(String[] args){
	int ans = 0;
    Scanner scan = new Scanner(System.in);
    for(int i = 0;i < 5;i++){
      if(scan.nextInt() == 0)ans = i+1;
    }
    System.out.println(ans);
  }
}