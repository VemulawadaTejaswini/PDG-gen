import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] taste = new int[n];
        int ans = 0;
        boolean jdg = true;

        for(int i = 0;i < n;i++){
            taste[i] = l+i-1;
            ans += taste[i];
            if(taste[i] == 0)
            jdg = false;
        }

        System.out.println(jdg == true?ans-taste[0]:ans);

    }
}