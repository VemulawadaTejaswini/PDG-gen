import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String []result_num = new String[N];
        
        for (int i = 0; i < M; i++){
            int key = sc.nextInt();
            int value = sc.nextInt();
            
            if (N >=2 && key == 1 && value == 0){
                System.out.println(-1);
                    return;
            }
            
            if (result_num[key-1] != null){
                if (Integer.parseInt(result_num[key-1]) != value){
                    System.out.println(-1);
                    return;
                }else {
                    continue;
                }
            } 
            result_num[key-1] = Integer.toString(value);
        }
        
        for (int i = 0; i < result_num.length; i++){
            
            if (result_num[i] == null){
                if (i == 0){
                    result_num[i] = Integer.toString(1);
                }else {
                    result_num[i] = Integer.toString(0);
                }
            }
            System.out.print(result_num[i]);
        } 
        
    }
}
