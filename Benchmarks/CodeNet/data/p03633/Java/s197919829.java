import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long valueLCM = 0;
    ArrayList<Long> list = new ArrayList<>();
    for(int i=0;i<N;i++){
      list.add(sc.nextLong());
    }
    for(int i=0; i<list.size()-1; i++) {
       if(i==0){
         valueLCM = calcLCM(list.get(i),list.get(i+1));
       }else{
         valueLCM = calcLCM(valueLCM,list.get(i+1));
       }
    }    
    System.out.println(valueLCM);
  }
  
  
   private static long calcLCM(long val1, long val2) {
        long maxValue = Math.max(val1, val2);
        long minValue = Math.min(val1, val2);
        long val3;
        if(minValue==0) return maxValue;
        long temp;
        while( (temp=maxValue%minValue)!=0 ) {
            maxValue=minValue;
            minValue=temp;
        }
        //最大公約数でval1,val2を割って、小さいほうにじゃないほうvalをかければオーバーフローしない
        long val1d=val1/minValue;
        long val2d=val2/minValue;
     if(val1d>=val2d){
       return val2d*val1;
     }else{
       return val1d*val2;
     }
  }
  
}
