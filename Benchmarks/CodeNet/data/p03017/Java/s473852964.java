import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt()-1;
        int b = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        int d = sc.nextInt()-1;
        char[] s = sc.next().toCharArray();
        boolean ans = true;
        boolean cross = d < c;
        int idx = a;
        boolean tmp1 = false;
        while(true){
            if(c - idx < 3){
                tmp1 = true;
                break;
            }
            if(idx+2 < n && s[idx+2] != '#') idx += 2;
            else if(idx+1 < n && s[idx+1] != '#') idx += 1;
            else {
                tmp1 = false;
                break;
            }
        }
        idx = b;
        boolean tmp2 = false;
        while(true){
            if(d - idx < 3){
                tmp2 = true;
                break;
            }
            if(idx+2 < n && s[idx+2] != '#') idx += 2;
            else if(idx+1 < n && s[idx+1] != '#') idx += 1;
            else {
                tmp2 = false;
                break;
            }
        }
        if(tmp1 && tmp2){
            if(cross){
                int l = 0;
                int r = 0;
                int tmp = 0;
                int max = 0;
                for (int i = 0; i < n; i++) {
                    if(s[i] == '.'){
                        r = i;
                        tmp++;
                    }else if(1 < i - r){
                        if(2 < max && (l <= b && d <= r)){
                            ans = true;
                            break;
                        }else{
                            tmp = 0;
                            max = 0;
                            l = i+1;
                            r = i+1;
                        }
                    }else{
                        if(max < tmp) max = tmp;
                        tmp = 0;
                    }
                }
                if(2 < max && (l <= b && d <= r)){
                    ans = true;
                }else ans = false;
            }else{
                ans = true;
            }
        }else{
            ans = false;
        }
        System.out.println(ans ? "Yes":"No");
        sc.close();

    }

}
