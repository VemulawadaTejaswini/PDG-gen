

import java.util.*;


class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();


        List<Long> list=new ArrayList<> ();
        for (int i = 0; i <n ; i++) {
           list.add(s.nextLong());
        }
        List<Long> ans=new ArrayList<> ();
        for (int i = 0; i <list.size() ; i++) {
            for (int j = i+1; j <list.size() ; j++) {
                ans.add(list.get(i)*list.get(j));
            }
        }
        Collections.sort(ans);

        System.out.println(ans);
        System.out.println(ans.size());
        System.out.println(ans.get(k-1));




    }
}