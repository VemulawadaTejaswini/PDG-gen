import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        boolean[] test = new boolean[N];
        int count1 = 0;
        int count2[] = new int[N];
        int count3 = 0;
        
        for(int i=0; i<M; i++){
            int p = sc.nextInt();
            String str = sc.next();
            if(!test[p-1] && str.equals("AC")){
                count1++;
                test[p-1] = true;
            }else if(!test[p-1] && str.equals("WA")){
                count2[p-1]++;
            }
        }
        for(int i=0; i<N; i++){
            if(!test[i]){
                count2[i]=0;
            }
            count3 += count2[i];
        }
        System.out.println(count1+" "+count3);
    }
}