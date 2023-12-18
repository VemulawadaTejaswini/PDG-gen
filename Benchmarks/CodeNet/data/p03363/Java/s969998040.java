import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList(N);

        for(int i=0; i<N; i++){
            int tmp = sc.nextInt();
            nums.add(tmp);
        }


        int cnt = 0;

        for(int i=0; i<N-1; i++){
            int tmpAcc = nums.get(i);
            if(tmpAcc==0){
                cnt++;
            }
            for(int j=i+1; j<N; j++){
                tmpAcc += nums.get(j);
                if(tmpAcc == 0){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}