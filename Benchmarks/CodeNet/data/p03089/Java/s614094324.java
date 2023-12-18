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
        LinkedList<Integer> resc = new LinkedList<>();
        for(int i = n - 1;i >= 0;--i){
            if(i >= 1 && c[i] == c[i - 1])continue;
            if(res.size() + 1 < b[i]){
                marks.add(i);
            }
            else if(resc.size() >= 2 && b[i] >= 2&& resc.get(b[i] - 1) > c[i] && resc.get(b[i] - 2) > c[i]){
                marks.add(i);
            }
            else{
                res.add(b[i]);
                resc.add(b[i] - 1,c[i]);
                if(i < n - 1 && c[i + 1] == c[i])marks.add(i + 1);
                int last = -1;
                boolean flag = true;
                while (flag) {
                    flag = false;
                    //last = marks.size();
                    LinkedList<Integer> newMarks = new LinkedList<>();
                    for(int i2 = 0;i2 < marks.size();++i2){
                        int j = marks.get(i2);
                        if (flag || res.size() + 1 < b[j]) {
                            newMarks.add(j);
                        }
                        else if(resc.size() >= 2 && b[j] >= 2&& resc.get(b[j] - 1) > c[j] && resc.get(b[j] - 2) > c[j]){
                            newMarks.add(j);
                        }else {
                            int now = j;
                            res.add(b[now]);
                            resc.add(b[now] - 1,c[now]);
                            ++now;
                            while (now < n && c[now - 1] == c[now]){
                                boolean f2 = false;
                                for(int i3 = 0;i3 < i2;++i3) {
                                    if (b[marks.get(i3)] == b[now]) {
                                        newMarks.add(now);
                                        f2 = true;
                                        break;
                                    }
                                }
                                if(f2)break;
                                res.add(b[now]);
                                resc.add(b[now] - 1,c[now]);
                                ++now;
                            }
                            flag = true;
                        }
                    }
                    marks = newMarks;
                }
            }
        }
        for(int k:res){
            System.out.println(k);
        }
      /*  System.out.println();
       LinkedList<Integer> test = new LinkedList<>();
       for(int k:res){
          test.add(k - 1,k);
       }
       StringBuilder sb = new StringBuilder();
       for(int k:test){
           sb.append(k);
           sb.append(' ');
       }
        System.out.println(sb);*/

    }

}


