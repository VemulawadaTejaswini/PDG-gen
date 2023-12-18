import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	int D = sc.nextInt();
      	
       	boolean flg=true;
      	for(;flg==true;){
          C=C-B;
         if(C<=0){
         System.out.println("Yes");
         flg=false;
           break;
         }
          A=A-D;
          if(A<=0){
         System.out.println("No");
         flg=false;
         }
         }
        
		
		
	}
}