import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int cou = 0;
    for(int i=1; i<=b; i++) {
    	if(k*i>=a && k*i<=b) {
    		cou++;
    		}
    }
    if(cou != 0){
    	System.out.println("OK");
    }else{
    	System.out.println("NG");
      }
}
}