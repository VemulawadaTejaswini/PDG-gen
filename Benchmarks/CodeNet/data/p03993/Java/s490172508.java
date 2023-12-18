import java.util.*;

public class Main {

    private static String getPairID(int i1, int i2){
        return (i1<i2)? String.valueOf(i1) + "-" + String.valueOf(i2) : String.valueOf(i2) + "-" + String.valueOf(i1);
    }
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int N = scanner.nextInt();
       int[] ar1 = new int[N];
       
       for (int i=0;i<N;i++){
        ar1[i] = scanner.nextInt();
       }
       
       int pairCount = 0;
       
       LinkedList<String> pairList = new LinkedList<>();
       for (int i=0;i<N;i++){
           String pairID = getPairID(i+1, ar1[i]);
           if (pairList.contains(pairID)){
               pairCount++;
           }
           else{
               pairList.add(pairID);
           }
       }       
      System.out.print(pairCount);
    }
}