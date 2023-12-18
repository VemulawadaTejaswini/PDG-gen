import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      String N = sc.next()+"0";
      int Nl = N.length()-1;
      long count = 0;
      for(int i=0;i<Nl;i++){
        String p = N.substring(i, i+1);
        int p1 = Integer.parseInt(N.substring(i+1, i+2));
        if("0".equals(p)){
          if(p1>5){
            count++;
          }
        }
        if("1".equals(p)){
          if(p1>5){
            count++;
          }
        }
        if("2".equals(p)){
          count+=1;
          if(p1>5){
            count++;
          }
        }
        if("3".equals(p)){
          count+=2;
          if(p1>5){
            count++;
          }
        }
        if("4".equals(p)){
          count+=3;
          if(p1>5){
            count++;
          }
        }
        if("5".equals(p)){
          count+=4;
          if(p1>5){
            count++;
          }
        }
        if("6".equals(p)){
          count+=4;
          if(p1<6){
            count++;
          }
        }
        if("7".equals(p)){
          count+=3;
          if(p1<6){
            count++;
          }
        }
        if("8".equals(p)){
          count+=2;
          if(p1<6){
            count++;
          }
        }
        if("9".equals(p)){
          count++;
          if(p1<6){
            count++;
          }
        }
      }

      System.out.println(count);


    }
  
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}
  
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}
