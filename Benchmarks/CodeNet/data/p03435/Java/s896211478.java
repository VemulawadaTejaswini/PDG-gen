import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
        int num1[] = new int[3];
        for(int i = 0; i < 3; i++){
        	num1[i] = sc.nextInt();
        }
        int num2[] = new int[3];
          for(int j = 0; j < 3; j++){
              num2[j] = sc.nextInt();
          }
      	int num3[] = new int[3];
          for(int k = 0; k < 3; k++){
              num3[k] = sc.nextInt();
          }
        //a1を決める
      	int a1 =0;
      	//計算用
      	int b1 =0;
      	int b2 =0;
      	int b3 =0;
      	int a11 =0;
        int a21 =0;
        int a31 =0;

        for(int i = 0; i < 100; i++){
          	b1 = num1[0]-a1;
          	b2 = num1[1]-a1;
          	b3 = num1[2]-a1;
            a11 =num2[0]-b1;
            a21 =num2[1]-b2;
            a31 =num2[2]-b3;
        	if(a11==a21 || a21==a31){
            	System.out.println("Yes");
              	return;
            }else{
              a1 = a1+i;
            }
        }
        System.out.println("No");
     }
}