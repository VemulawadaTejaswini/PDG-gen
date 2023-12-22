import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int cnt[] = new int[n + 1];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            cnt[a[i]] += 1;
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
            cnt[b[i]] += 1;
        }

        ArrayList<ArrayList<Integer>> q = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n + 2; i++){
            ArrayList<Integer> r = new ArrayList<Integer>();
            q.add(r);
        }
        for(int i = 1; i < n + 1; i++){
            if(cnt[i] > n){
                q.get(n + 1).add(i);
            }else{
                q.get(cnt[i]).add(i);
            }
        }
        //配列cntと2次元リストqを確認
        //System.out.println("cnt:" + Arrays.toString(cnt));
        //System.out.println("q:" + q);

        //2次元リストlist_a,list_bを作る
        ArrayList<ArrayList<Integer>> list_a = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> r = new ArrayList<Integer>();
            list_a.add(r);
        }
        for(int i = 0; i < n; i++){
            list_a.get(a[i]).add(i);
        }

        ArrayList<ArrayList<Integer>> list_b = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> r = new ArrayList<Integer>();
            list_b.add(r);
        }
        for(int i = 0; i < n; i++){
            list_b.get(b[i]).add(i);
        }
        //System.out.println("list_a:" + list_a);
        //System.out.println("list_b:" + list_b);

        //並べ替えた数列を格納するリストans
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            ans.add(-1);
        }
        //System.out.println("ans:" + ans);

        ArrayList<Integer> p = new ArrayList<Integer>();
        for(int i = n; i > 0; i--){
            //q.get(i)をコピーしたリストsを作る
            ArrayList<Integer> s = (ArrayList<Integer>)q.get(i).clone();
            if(s.size() == 0){
                continue;
            }else if(s.size() == 1){
                continue;
            }else{
                //n個ある数字が2種類あるとき
                int x = s.get(0);
                int y = s.get(1);
                ArrayList<Integer> t = (ArrayList<Integer>) list_a.get(x).clone();
                ArrayList<Integer> u = (ArrayList<Integer>) list_a.get(y).clone();
                int z = t.size();
                for(int j = 0; j < z; j++){
                    ans.set(t.get(j), y);
                }
                z = u.size();
                for(int j = 0; j < z; j++){
                    ans.set(u.get(j), x);
                }
            }
        }
        if(q.get(n + 1).size() > 0){
            System.out.println("No");
        }else if(q.get(n).size() == 2){
            System.out.println("Yes");
            for(int i = 0; i < n - 1; i++){
                System.out.print(ans.get(i) + " ");
            }
            System.out.println(ans.get(n - 1));
        }
        //System.out.println("ans:" + ans);
    }
}
