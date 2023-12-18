import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int countW=0;
        int countE=0;
        int[] numW = new int[N];
        int[] numE = new int[N];
        int[] sum = new int[N];
        int min = N;
        
        for(int i=0; i<N; i++){
            if(str.charAt(i)=='W'){
                countW++;
                numW[i] = countW;
                numE[i] = countE;
            }else{
                countE++;
                numW[i] = countW;
                numE[i] = countE;
            }
            //System.out.println(i+">"+numW[i]+":"+numE[i]);
        }
        for(int i=0; i<N; i++){
            sum[i] = numW[i]+(numE[N-1]-numE[i]);
            if(min>sum[i]){
                if(i==0){
                    min=sum[i]-1;
                }else{
                min=sum[i];
                }
                //System.out.println(min);
            }
        }
        System.out.println(min);
    }
}