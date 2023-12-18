import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n]; //数列
        int count[] = new int[n]; //各値の出現回数
        int sum=0; //Nから選ぶときのパターン

        for(int i=0;i<n;i++)count[i]=0;

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt()-1;
            count[a[i]]++;
        }

        for(int i=0;i<n;i++){
            if(count[i]>1){
                sum += (count[i]*(count[i]-1))/2;
            }
        }

        for(int i=0;i<n;i++){
            int num = a[i]; //numのボールが一個減る
            int dif = 0;
            if(count[num]>1){
                dif = count[num]-1;
            }
            System.out.println(sum-dif);
        }

    }
}
