import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long L = sc.nextLong();
      long R = sc.nextLong();
int mod = 2019;
      long minn =R;
      long min =L;
      long tmp =L;
      int count = 0;
      long r=R%mod;
      long l=L%mod;
      long k=0;
      long m=0;
      if(R-L>2019){
        min=0;
      }else{
		if(l>r){
  			min=0;
		}else{
          min=1;
          minn=(r*l)%mod;
          for(k=l;k<r;k++){
            for(m=k+1;k<=r;m++){
              if(minn>(k*m)%mod){
                minn=(k*m)%mod;
              }
            }
          }
        }
      }


      System.out.println(min*minn);
    }
  
}