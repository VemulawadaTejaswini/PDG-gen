import java.util.*;

public class a044{
	public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int k = sc1.nextInt();
        int x = sc1.nextInt();
        int y = sc1.nextInt();
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += x;
        }
        for(int j = 0; j < n-k; j++){
            sum += y;
        }
        System.out.print(sum);
    }
}