import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int N = 0;
        int unique = 0;
        N = sc.nextInt(); // 回数
        String[] ar = new String[N];
        for (int i = 0; i < N; i++) {
            ar[i] = sc.next(); // 配列に入れていく
        }
        for(int i=0;i<N;i++){ 
            int EndCount = 0;
            for (int j=0; j<i; j++) {
              //  System.out.println("ar[i]:ar["+i+"]="+ar[i]);
                //System.out.println("ar[j]:ar["+j+"]="+ar[j]);
                if (ar[i].equals(ar[j]) ) {
                  //  System.out.println("ここは？");
                    EndCount = 1;
                    break;
                }
            }
            if(EndCount==0){
            //System.out.println("EndCount="+EndCount);
            
                unique++;
                
            //System.out.println("unique="+unique);
            }
        }
    
        System.out.println(unique);
    }
}