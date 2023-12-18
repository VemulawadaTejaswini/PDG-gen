import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
        String RGB = sc.next();
        int Rcnt = 0;
        int Gcnt = 0;
        int Bcnt = 0;
        for(int i=0; i<N;  i++){
          char chari = RGB.charAt(i);
          if(chari=='R'){
            Rcnt++;
            continue;
          }
          if(chari=='G'){
            Gcnt++;
            continue;
          }
          Bcnt++;
        }
        long cnt = (long) Rcnt*Gcnt*Bcnt;
      	int sp = (int) Math.floor((N-3)/2);
      
      	if(N%2==0){
            for(int i=0; i<sp+1;  i++){
              cnt -= detecter(N, i, RGB);
            }
      		System.out.println(cnt);
        	return;
    	}else{
            for(int i=0; i<sp+2;  i++){
              cnt -= detecter(N, i, RGB);
            }
      		System.out.println(cnt);
        	return;
    	}
	}
  public static long detecter(int N, int NN, String RGB){
        long cnt = (long) 0;
        for(int i=0; i<N;  i++){
          if(N<=(i+2*NN)){
            return cnt;
          }
          if(RGB.charAt(i)==RGB.charAt(i+NN)){
            continue;
          }
          if(RGB.charAt(i)==RGB.charAt(i+2*NN)){
            continue;
          }
          if(RGB.charAt(i+NN)==RGB.charAt(i+2*NN)){
            continue;
          }
          cnt++;
        }
        return cnt;
	}
}
