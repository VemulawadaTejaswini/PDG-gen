import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//金額
      	
      while(n>0){
		n=n-1000;
      }
     
        System.out.println(-n); 
     
    } 
}








