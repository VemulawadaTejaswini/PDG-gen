import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int[] a = new int[s.length()];
        for(int i = 0; i < a.length; i++){
            if(s.charAt(i) == '0'){
                a[i] = 0;
            }
            else{
                a[i] = 1;
            }
        }
        int ans = 1;
        for(int i = 2; i <= a.length; i++){
            int count = 0;
            for(int j = 0; j < a.length - i + 1; j++){
                if(a[j] == 1){
                    count++;
                    for(int l = 0; l < i; l++){
                         a[j + l] = (a[j + l] + 1 ) % 2;
                    }
                }
            }
            int key = 0;
            for(int k = 0; k < i; k++){
                if(a[a.length - 1 - k] == 1){
                    key = 1;
                    break;
                }
              ans = Math.max(ans, count);
            }
/*            if(key == 0){
                ans = Math.max(ans, count);
            }*/
        }
        System.out.println(ans);
    }
}