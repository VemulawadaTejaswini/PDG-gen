import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] data = new int[100010];
        int[] low = new int[100010];
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            data[i] = a;
        }
        for(int i=0; i<N; i++){
            low[i] = 1;
        }
        int flag = 1;
        for(int i=0; i<N-1; i++){
            if(data[i]>data[i+1]){
                if(low[i]==1){
                    data[i]--;
                }else{
                    flag=0;
                }
                if(flag==0){
                    break;
                }
                if(i>=1) {i--;}
            }
        }
        for(int i=0; i<N-1; i++){
            if(data[i]>data[i+1]){
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}