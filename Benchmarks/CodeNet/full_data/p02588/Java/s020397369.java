import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		double[] b = new double[a];
		for(int i = 0; i < a; i++){
			b[i] = sc.nextDouble();
		}
		int c = 0; 
		for(int i = 0;i < a;i++){
			for(int j = i + 1;j < a;j++){
              if((Math.abs(b[i] - Math.round(b[i])) > 0.0000004) || (Math.abs(b[i] - Math.round(b[i])) == 0) && (Math.abs(b[j] - Math.round(b[j])) > 0.0000004) || (Math.abs(b[j] - Math.round(b[j])) == 0)){
              	if(b[i] * b[j] - Math.floor(b[i] * b[j]) == 0){
					c ++;
				}
              }
				
			}
		}
		System.out.println(c);
		
		
	}
}
