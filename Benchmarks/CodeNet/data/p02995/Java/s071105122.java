import java.util.*;
public class Main {
  static long num=0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long A = sc.nextLong();
		long B=sc.nextLong();
      long C =sc.nextLong();
      long D=sc.nextLong();
      for(long i=A;i<B;i++){
      if(!(i%C==0||i%D==0)){
        num++;
      }
      if(i<B/C||i<B/D)
        break;
      }
      System.out.println(num);
     	}
}