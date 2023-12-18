import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int i = 1;
        while(ans < n){
            ans = i * i;
            i++;
            if(ans > n){
                ans = (i-2) * (i-2);
                break;
            }
        }
        System.out.println(ans);
    }
}