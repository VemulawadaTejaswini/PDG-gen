import java.util.*;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chs = sc.next().toCharArray();
        int n = chs.length;

        long count = 1;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int l = i;
                int r = j;

                long isCount = 0;
                while(r - l > 0) {
                    if(chs[l] != chs[r]) {
                        isCount = 1;
                        break;
                    } else {
                        l++;
                        r--;
                    }
                }
             count += isCount;
            }
        }

        System.out.println(count);

    }
}