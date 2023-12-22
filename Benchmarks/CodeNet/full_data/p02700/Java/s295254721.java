import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int takahashiHP = sc.nextInt();
        int takahashiA = sc.nextInt();
		int aokiHP = sc.nextInt();
        int aokiA = sc.nextInt();
      
      while(takahashiHP<=0){
        aokiHP =- takahashiA;
        if(aokiHP<=0){
          System.out.println("yes");
          break;
        }
        takahashiHP =- aokiA;
      }
        
      System.out.println("no");
    }
}
