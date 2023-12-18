import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    if(N < 10){
      System.out.println(N);
      return;
    }
    int[] Wn = {1,3,7,13,21,31,43,57,73,91};
  	Integer[] Tn = new Integer[Wn.length];
    Tn[0] = 9;
    for(int i=1; i < Wn.length; i++){
      Tn[i] = (3*(Tn[i-1]-Wn[i-1]) + 2*Wn[i-1]) + Tn[i-1];
    }
    Tn[9] = 99999;
    Integer kn = 1;
    for(int i=1; i < 10; i++){
      if(N < Tn[i]){
        kn = i;
        break;
      }
    }
    Long ans = runrun(kn, N-Tn[kn-1]);
    
    System.out.println(ans);
    return;
  }
  public static Long runrun(int kn, int nn){
    int cnt = 0;
    double result = Math.pow(10,kn);
    Long start = (long)result;
    Long end = 10*start;
    for(Long i = start; i < end; i++){
      if(runrunChk(kn, i)){
        cnt++;
      }
      if(cnt==nn){
        return i;
      }
    }
    return Long.valueOf(10);
  }
  public static boolean runrunChk(int kn, Long runrun){
    if(kn==0){
      return true;
    }
    double result = Math.pow(10,kn);
    int res = (int)result;
    int pointer = (int) Math.floor(runrun/res);
    int head = 10*pointer;
    int compare = ((int) Math.floor(runrun/(res/10))) - head;
    if(((pointer - compare)==-1) || ((pointer-compare)==0) || ((pointer - compare)==1) ){
        return runrunChk(kn-1, (runrun - pointer*res));
    }else{
        return false;
    }
  }
}