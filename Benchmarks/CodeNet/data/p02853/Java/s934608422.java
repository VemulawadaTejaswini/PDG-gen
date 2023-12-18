import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
      int i = 0;
      if(a<=3){
        i += (4-a)*100000;
      }if(b<=3){
        i += (4-b)*100000;
      }if(a==1 & b==1){
        i = 1000000;
      }
      System.out.println(i); 
        
        

	}
}