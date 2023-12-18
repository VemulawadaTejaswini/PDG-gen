

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int K = sc.nextInt();
        int nodes[] = new int[N];
        Branch branches[] = new Branch[N-1];

        Map<Integer, List<Integer>> bMap = new HashMap<>();

        ArrayList<Integer> a,b;
        for(int i=0;i<N-1;i++) {
            branches[i] = new Branch();
            branches[i].left = sc.nextInt();
            branches[i].right = sc.nextInt();
            a = (ArrayList<Integer>) bMap.get(branches[i].left);
            if (a==null) { a = new ArrayList<>(); }
            a.add(branches[i].right);
            bMap.put(branches[i].left, a);
            a = (ArrayList<Integer>) bMap.get(branches[i].right);
            if (a==null) { a = new ArrayList<>(); }
            a.add(branches[i].left);
            bMap.put(branches[i].right, a);
        }

        for(int i=1;i<=N;i++) {
            a = (ArrayList<Integer>) bMap.get(i);
//            System.out.print(i + " : ");
            if (a != null) {
                for (Iterator itr = a.iterator(); itr.hasNext(); ) {
//                    System.out.print(itr.next() + " ");
                }
            }

                int counter = 0;
                for (Iterator itr = a.iterator(); itr.hasNext(); ) {
                    int index = ((int)itr.next())-1;
 //                   System.out.print("(" + index + ":" +nodes[index] + ") ");
                    if (nodes[index] != 0) {
                        counter++;
                    }

                    b = (ArrayList<Integer>) bMap.get(index+1);
                    for (Iterator itr2 = b.iterator(); itr2.hasNext(); ) {
                        int index2 = ((int)itr2.next())-1;
//                        System.out.print("((" + index2 + ":" +nodes[index2] + ")) ");
                        if (nodes[index2] != 0) {
                            counter++;
                        }
                    }
                }
//            System.out.print("[" + counter + "]");
                nodes[i-1] = K-counter;
//            System.out.println();
        }
//        System.out.println();

        long ans = 1;
        for(int i=0;i<N;i++) {
//            System.out.print(nodes[i] + " ");
            ans *= nodes[i];
        }
        ans = ans % 1000000007;
        System.out.println(ans);
//        System.out.println();

    }

    private static class Branch {
        int left;
        int right;

    }
}