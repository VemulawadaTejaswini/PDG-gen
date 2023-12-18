import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt();
        int m = sc.nextInt();//試行回数
        int[] a = new int[card];//cardに書かれている整数
      	int[] acopy = new int[card];
        int[] b = new int[m];//選ぶcardの枚数
        int[] c = new int[m];//書き換える整数
        long[] A = new long[m];//答えを格納
        long ans = 0;
        long tmp = 0;
        long answer = 0;

        for(int i = 0;i < card;i++){
            a[i] = sc.nextInt();
          	acopy[i] = a[i];
        }
        Arrays.sort(acopy);
           
        for(int i = 0;i < m;i++){
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
      
        for(int i = 0;i < m;i++){
            Arrays.sort(a);
            for(int j = 0;j < b[i];j++){
                if(a[j] < c[i])
                a[j] = c[i];
            }
          for(int k = 0;k < card;k++){
                    A[i] += a[k]; 
                }
          	for(int n = 0;n < b[i];n++){
            	a[n] = acopy[n];
            }
        }
      
        for(int i = 0;i < m;i++){
            ans = A[i];
            if(tmp < ans){
                answer = ans;
            }
            tmp = answer;
        }

        System.out.println(answer);

    }
}