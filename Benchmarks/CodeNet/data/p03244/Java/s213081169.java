import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            //入力
            int n = scan.nextInt();
            int[] v = new int[n];
            for(int i = 0; i < n; i++){
                v[i] = scan.nextInt();
            }

            int[][] ans = new int[2][100001];
            for(int i = 0; i < n; i++){
                if(i % 2 == 0){
                    ans[0][v[i]]++;
                }else{
                    ans[1][v[i]]++;
                }
            }


            int num = 0;

            int even = calcNum(ans[0]);
            int odd = calcNum(ans[1]);
            int evenNum = ans[0][even];
            int oddNum = ans[1][odd];
            if(even == odd){
                ans[0][even] = 0;
                ans[1][odd] = 0;
                int even2 = calcNum(ans[0]);
                int odd2 = calcNum(ans[1]);
                int even2Num = ans[0][even2];
                int odd2Num = ans[0][odd2];
                if(evenNum + odd2Num >= oddNum + even2Num){
                    num = n-evenNum-odd2Num;
                }else{
                    num = n-oddNum-even2Num;
                }
            }else{
                num = n-evenNum-oddNum;
            }

            System.out.println(num);

        }finally{
            scan.close();
        }
    }

    static int calcNum(int[] ansEven){
        int max = -1;
        for(int i = 0; i < 100000; i++){
            if(max < ansEven[i]){
                max = i;
            }
        }
        return max;
    }

}
