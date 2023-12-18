
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int X = sc.nextInt();
      	int Y = sc.nextInt();
      	int Z = sc.nextInt();
      
      	int[] S=new int[3];
        S[1]=X;
        S[2]=Y;
        S[3]=Z;
        
        int temp=S[1];
        S[1]=S[2];
        S[2]=temp;
        
        int tem=S[1];
        S[1]=S[3];
        S[3]=tem;
        
		System.out.println(S[1] S[2] S[3]);
		
	}
}
