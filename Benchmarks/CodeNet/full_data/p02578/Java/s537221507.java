import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long result[] = new long[N];
        long Comparison[] = new long[N];
        long min;
        long anc = 0;
        for(int i = 0;i < N;i++){
            result[i] = sc.nextInt();
            if(i < 1){
                Comparison[i] = result[i];
            }else{
                if(Comparison[i - 1] < result[i]){
                    Comparison[i] = result[i];
                }else{
                    Comparison[i] = Comparison[i-1];
                }
            }
        }
        for(int i = 0;i < N;i++){
            if(result[i] != Comparison[i]){
                min = Comparison[i] - result[i];
                anc += min;
            }
        }
        System.out.println(anc);
    }
}
