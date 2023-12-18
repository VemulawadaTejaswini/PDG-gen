import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s[] = sc.nextLine().split(" ");
        int a[] = new int[s.length];
        for(int i = 0;i<s.length;i++){
            a[i] = Integer.parseInt(s[i]);
        }
        int ans = 0;
        for(int j = 0;j<s.length;j++){
            int m = a[j]*2-1;
            int tmp = 0;
            for(int i = 0;i<s.length;i++){
                tmp += m%a[i];
                if(tmp>ans){
                    ans = tmp;
                }
            }
        }
        System.out.println(ans);
    }
}