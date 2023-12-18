import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    //int[] candle = new int[N];
    //int[] candleState = new int[N];
    List<Integer> positive = new ArrayList<Integer>();
    List<Integer> negative = new ArrayList<Integer>();
    int minDistance=300000000;

    for(int i=0;i<N;i++){
      int c=sc.nextInt();
      //candle[i]=c;
      if(c==0){
        //  candleState[i]=0;
        K--;
      }else if(c>0){
        //  candleState[i]=1;
        positive.add(c);
      }else{
        //  candleState[i]=-1;
        negative.add(c);
      }
    }
    Collections.reverse(negative);
    if(K>0){
      for(int i=Math.max(K-negative.size(),0);i<=Math.min(positive.size(),K);i++){
        if(i!=0&&i!=K){
          int pDis = positive.get(i-1);
          int nDis = negative.get(K-i-1);
          int dis = Math.min(pDis*2-nDis,pDis-nDis*2);
          minDistance=Math.min(dis,minDistance);
        }else if(i==0){
        minDistance =  Math.min(minDistance,negative.get(K-1)*(-2));
        }else{
          minDistance =  Math.min(minDistance,positive.get(K-1)*(2));
        }

      }
      System.out.println(minDistance);
    }else{
      System.out.println(0);
    }
  }
}
