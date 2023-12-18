import java.util.*;

public class Main{
	public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int k = sc1.nextInt();
        int x = sc1.nextInt();
        int y = sc1.nextInt();
        int sum = 0;
        if(n < k){
            for(int j = 0; j < n; j++){
                sum += x;
            }
            System.out.print(sum);
        }else{
           for(int i = 0; i < k; i++){
                sum += x;
            }
            for(int j = 0; j < n-k; j++){
                sum += y;
            }
            System.out.print(sum);
        }
    }
}