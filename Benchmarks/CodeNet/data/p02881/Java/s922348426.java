import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//入力値
      	long n = sc.nextLong();
      
      	//入力値の平方根
      	int a = (int)Math.sqrt(n);
      
      	//移動回数
      	long b =0;
      	
      	for(long i = 1;i<=a+1;++i){
          if(n%i==0){
            if(i==1){
              b = 1+(n/1 - 1);
            }else if(b>(i-1)+(n/i - 1)){
              b = (i-1)+(n/i - 1);
            }else{
               b = 1+(n/1 - 1);
            }
          }
        }
      System.out.println(b);
    }
}