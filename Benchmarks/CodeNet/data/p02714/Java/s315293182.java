import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] let = sc.next().toCharArray();
        int a = 0, b = 0, c = 0;
        for(int i = 0; i < n; i++){
            if(let[i] == 'R') a++;
            if(let[i] == 'B') b++;
            if(let[i] == 'G') c++;
        }
        long ans = a * b * c;
        long sub = 0;
        for(int i = 0; i < n; i++){
           for(int j = i + 1; j < n; j++){
               if(let[i] != let[j] && 2 * j - i < n){
                   if(let[i] != let[2 * j - i] && let[j] != let[2 * j - i]) sub++;
               }
           }
        }
        System.out.println(ans - sub);
    }
}