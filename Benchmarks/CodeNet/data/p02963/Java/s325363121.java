import java.util.*;
public class Main {
  	static int mod = 1000000007;
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	long S = sc.nextLong();
    long tani = 1000000000L;
  	long i =1;

	if(S<=tani){
      System.out.println("0 0 0 1 0 "+S);
    }else if(S%tani==0){
      System.out.println("0 0 0 "+(S/tani)+" 0 "+tani);
    }else{
      i=S/tani;
      System.out.println("0 0 "+ i+" "+((i+1)*tani-S) +" 1 "+tani);
    }
  }
} 