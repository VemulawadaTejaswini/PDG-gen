import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++) a[i] = sc.nextInt();
        int odd = 0;
        int two = 0;
        int four = 0;
        for(int i=0;i<N;i++){
            if(a[i]%2==1) odd++;
            else{
                if(a[i]%4==0) four++;
                else two++;
            }
        }
        String ans = "No";
        if(four>=odd) ans = "Yes";
        if(four==odd-1&&two==0) ans="Yes";
        System.out.println(ans);
    }
}
