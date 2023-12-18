import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        int[] nums = new int[]{a,b,c};
        for (int n : nums) {
            lst.add(n);
        }
        rec(ans, new ArrayList<>(), lst);
        //System.out.println(ans);
        int max = 0;
        for (List<Integer> l : ans) {
            int oko = l.get(0) * 10 + l.get(1) + l.get(2);
            max = Math.max(oko, max);
        }
        System.out.println(max);
    }

    private static void rec(List<List<Integer>> ans, List<Integer> one, List<Integer> lst){
        if(lst.isEmpty()) {
            ans.add(one);
            return ;
        }

        for(int i=0;i < lst.size();i++){
            List<Integer> next = new ArrayList<>(one);
            List<Integer> temp = new ArrayList<>(lst);
            next.add(lst.get(i));
            temp.remove(i);
            rec(ans, next, temp);
        }
    }
}
