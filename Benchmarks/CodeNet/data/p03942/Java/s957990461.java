import java.util.Scanner;

/**
 * Created by Raytan on 2016/11/12.
 */
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String a = scanner.next();
        String b = scanner.next();
        char[] a_ = new char[length];
        char[] b_ = new char[length];
        boolean flags[] = new boolean[length];
        for (int i = 0; i < length; ++i) {
            a_[i] = a.charAt(i);
            b_[i] = b.charAt(i);
            if(a_[i] != b_[i]){
                flags[i] = true;
            }
        }
        int list[] = new int[length];
        for (int i = 0;i < length;++i){
            if(flags[i]){
                int k = i - 1;
                while (true){
                    if(a_[k] == b_[i]){
                        list[k] = i;
                        break;
                    }
                    --k;
                    if(k < 0){
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        int k = 0;
        for (int i = 0;i < length;++i){
            if(list[i] > 0){
                ++k;
            }
        }
        int list2[] = new int[k];
        int f = 0;
        for (int i = 0;i < length;++i){
            if(list[i] > 0){
                list2[f] = list[i];
                ++f;
            }
        }
        int group[] = new int[k];
        for (int i = 0;i < k;++i){
            group[i] = 1;
        }
            for (int j = 0;j < k;++j){
                int t = list2[j];
                int u = list[t];
                for (int i = j;i < k;++i){
                    if(list2[i] > u){
                        break;
                    }
                    if(list2[i] > t&&j != i){
                        group[i] += 1;
                    }
                }

            }
        int vn = 0;
        for (int i = 0;i < k;++i){
            if(vn < group[i]){
                vn = group[i];
            }
        }
        System.out.println(vn);


    }
}
