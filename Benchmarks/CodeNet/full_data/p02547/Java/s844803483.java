import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] a = new int[7][3];
        
        for(int i = 0 ; sc.hasNext() ; i++){
            for(int j = 0 ; j < 2 ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        int count = 0;
        boolean flg = false;
                
        for(int i = 0 ; i < N ; i++){
            int c = 0;
            int d = 0;
            
            if(flg == false){
                if((a[i][0] == a[i][1])){
                    flg = true;
                }
            }else{
                if((a[i][0] == a[i][1])){
                    count++;
                    flg = true;
                }else{
                    count = 0;
                    flg = false;
                }
            }
        }
        
        if(count >= 2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}