import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i = 0;i < n;++i){
            b[i] = sc.nextInt();
            c[i] = i + 1 - b[i];
            if(c[i] < 0 || (i >= 1 && c[i] < c[i - 1])){
                System.out.println(-1);
                return;
            }
        }

        LinkedList<Integer> marks = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        for(int i = n - 1;i >= 0;--i){
            if(i >= 1 && c[i] == c[i - 1])continue;
            if(res.size() + 1 < b[i]){
                marks.add(i);
            }
            else{
                int now = i;
                res.add(b[now]);
                ++now;
                while (now < n && c[now - 1] == c[now]) {
                    res.add(b[now]);
                    ++now;
                }
                LinkedList<Integer> newMarks = new LinkedList<>();
                for(int j:marks){
                    if(res.size() + 1 < b[j]){
                        newMarks.add(j);
                    }
                    else{
                        now = j;
                        res.add(b[now]);
                        ++now;
                        while (now < n && c[now - 1] == c[now]) {
                            res.add(b[now]);
                            ++now;
                        }
                    }
                }
                marks = newMarks;
            }
        }
        for(int k:res){
            System.out.println(k);
        }

    }

}


