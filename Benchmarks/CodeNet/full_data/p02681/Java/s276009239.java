import java.util.*;

class Main{
	public static void main(String[] args){
     	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();	//１が書かれたカード
      	int b = sc.nextInt();	//０が書かれたカード
      	int c = sc.nextInt();	//-1が書かれたカード
      	int k = sc.nextInt();	//選ぶ枚数
      	int sum = 0;
      
      	if(a>=k){
          	sum = sum+1*k;
        }else{
          	sum = sum+1*a;
          	k = k-a;
            if(b>=k){
          		sum = sum+0*k;
        	}else{
         		sum = sum+0*b;
              	k = k-b;
                if(c>=k){
         			sum = sum-1*k; 
        		}else{
         			sum = sum-1*c;
        		}
      		}
        }
      
      	System.out.println(sum);
      
    }
}