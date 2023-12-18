import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      Map<Long, Long> map = new TreeMap<>();
      long X,L;
      for(int i=0;i<N;i++){
        X=sc.nextLong();
        L=sc.nextLong();
        map.put(X,L);
      }
      int count=0;
      boolean flg = true;
      Long[] Xs=map.keySet().toArray(new Long[map.size()]);
      Long Xn,Ln;
      for (int j=0;j<N-1;j++){
        
        if(flg){
          X=Xs[j];
          L=map.get(X);
          Xn=Xs[j+1];
          Ln=map.get(Xn);
          if(X+L>Xn-Ln){
            count++;
            flg=false;
          }
        }else{
          flg =true;
        }
      }
      

          System.out.println(N-count);

    }
}