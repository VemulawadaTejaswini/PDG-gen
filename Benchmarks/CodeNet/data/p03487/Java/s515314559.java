import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int is[] = new int[l];
        for (int i = 0;i < l;++i){
            is[i] = scanner.nextInt();
        }
        int j = 0,k,alr = 0;
        while (true){
            if(j >= l){
                break;
            }
            k = is[j];
            if(k == -1){
                ++j;
                continue;
            }
            int c = 0;
            int rem = 0;
            boolean flag = false;
            for (int i = j;i < l;++i){
                if(is[i] == k){
                    is[i] = -1;
                    ++c;
                }
                if(c > k&&!flag){
                    flag = true;
                    c = k;
                    ++rem;
                }
            }
            if(!flag&&c < k){
                rem = c;
            }
            alr += rem;
            ++j;
        }
        System.out.println(alr);
    }
}