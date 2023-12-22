import java.util.*;

class Main{
	public static void main(String[] args){
     	Scanner sc = new Scanner(System.in);
      	String as = sc.next();	//１が書かれたカード
      	int a = Integer.parseInt(as);
      	String bs = sc.next();	//０が書かれたカード
      	int b = Integer.parseInt(bs);
      	String cs = sc.next();	//-1が書かれたカード
      	int c = Integer.parseInt(cs);
      	String ks = sc.next();	//選ぶ枚数
      	int k = Integer.parseInt(ks);
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
         			sum = sum+(-1)*k; 
        		}else{
         			sum = sum+(-1)*c;
        		}
      		}
        }
      
      	System.out.println(sum);
      
    }
}
