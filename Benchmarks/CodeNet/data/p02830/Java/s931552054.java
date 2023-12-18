import java.util.*;

class Main{
    //148b
    static final int DIV = 100000007;
    static final int MAX = 2000000000;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        char[] ans = new char[n*2];
        for(int i = 0;i < 2*n;i++){
            if(i%2==0){
                ans[i] = a[i/2];
            }else{
                ans[i] = b[i/2];
            }
        }
        String ansstr = String.valueOf(ans);
        System.out.println(ansstr);
    }
}