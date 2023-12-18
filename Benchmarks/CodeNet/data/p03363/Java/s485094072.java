import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n+1];
        s[0] = 0;
        for (int i=1;i<=n;i++){
            s[i]=s[i-1]+sc.nextInt();
        }
        Arrays.sort(s);
        int ans = 0;
        int count = 0;
        for (int i=1;i<=n;i++){
            while (i<n-1&&s[i]==s[i+1]){
                count++;
                i++;
            }
            ans+=combination(count,2);
            count=1;
        }
        System.out.println(3*ans);
    }
    static long factorial(int num){
        if (num<2)return 1;
        else return num*factorial(num-1);
    }
    static int arraySum(int[] array){
        int ans = 0;
        for (int value : array) ans += value;
        return ans;
    }
    static long combination(int a, int b){
        return factorial(a)/(factorial(b)*factorial(a-b));
    }
    static double log(double base,double antilogarithm){
        return Math.log(antilogarithm)/Math.log(base);
    }


}
