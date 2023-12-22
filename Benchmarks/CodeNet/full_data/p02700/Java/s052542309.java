import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	int D = sc.nextInt();
      
      	for(int i=0;i<100;i++){
          C=C-B;
         if(C<=0){
         break;
         }
          A=A-D;
         if(A<=0){
         break;
         }
        }
		
		if(A<=0&&C>0){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
	}
}