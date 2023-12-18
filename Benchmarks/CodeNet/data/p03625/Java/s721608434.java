import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum[] = new int[100000];
        int max = 0;
        int max2 = 0;

        Arrays.fill(sum, 0);

        for(int cnt = 0; cnt < N; cnt++){
        	int A = in.nextInt();
        	sum[A]++;
        }
        for(int cnt = N-1; cnt >= 0; cnt--){
        	if((sum[cnt] >= 4)&&(cnt > max)&&(cnt > max2)){
        		max = cnt;
        		max2 = cnt;
        		break;
        	}
        	else if(sum[cnt] >= 2){
        		if(cnt > max){
        			max = cnt;
        		}
        		else if(cnt > max2){
        			max2 = cnt;
        		}
        	}
        }
        if(sum[max] + sum[max2] >= 4){
            System.out.println(max*max2);
        }
        else{
        	System.out.println("0");
        }
    }
}