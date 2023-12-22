import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	
        // 入力
        int n = sc.nextInt();
      	int count=0;
      
      	for(int i=1;i<n;i++){
          double up=Math.sqrt(n-i);
          if(up%1==0){
            count+=1;//平方数の部分
          }
          if((n-i)%2==0){//2の倍数で計算量削減
            for(int j=1;j<up;j++){
              if((n-i)%j==0){
                count+=2;
              }
            }
          }else{
            for(int j=0;j<up/2-0.5;j++){
              if( (n-i)%(2*j+1)==0 ){
                count+=2;
              }
            }
          }
          
        }

      System.out.println(count);
      
    }
}






