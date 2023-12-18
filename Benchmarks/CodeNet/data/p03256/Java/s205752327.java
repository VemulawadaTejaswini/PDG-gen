import java.util.*;

public class Main {
    public static ArrayList[] e;
    public static boolean[] sb;
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        sb = new boolean[n];
        boolean[] self = new boolean[n];
        boolean[] next = new boolean[n];
        for(int i=0; i<n; i++){
            sb[i] = (s.charAt(i) == 'A');
        }
        e = new ArrayList[n];
        for(int i=0; i<n; i++){
            e[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<m; i++){
            int ma = sc.nextInt() - 1;
            int mb = sc.nextInt() - 1;
            e[ma].add(mb);
            e[mb].add(ma);
        }
        sc.close();

        boolean[] visa = new boolean[n];
        boolean[] visb = new boolean[n];
        for(int i=0; i<n; i++){
            if(search3(i, i, 0, visa, visb)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No"); 

        // for(int i=0; i<n; i++){
        //     if(e[i].contains(i)) self[i] = true;
        // }

        // for(int i=0; i<n; i++){
        //     if(search2(i, 0, i)){
        //         next[i] = true;
        //         continue;
        //     }
        // }

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<e[i].size(); j++){
        //         if(sb[i] == sb[(int)(e[i].get(j))] && next[i] && next[(int)(e[i].get(j))]){
        //             System.out.println("Yes");
        //             return;
        //         }
        //     }
        //     if(search(i, 0, i)){
        //         System.out.println("Yes");
        //         return;
        //     }
        // }

        // System.out.println("No");
    }

    // public static boolean search(int pos, int depth, int start){
    //     boolean ret = false;
    //     if(depth == 0){
    //         if(sb[pos]){ 
    //             for(int i=0; i<e[pos].size(); i++){
    //                 if(search((int)(e[pos].get(i)), 1, start)){
    //                     ret = true;
    //                     break;
    //                 }
    //             }
    //         }
    //     }else if(depth == 1){
    //         if(sb[pos]){
    //             for(int i=0; i<e[pos].size(); i++){
    //                 if(search((int)(e[pos].get(i)), 2, start)){
    //                     ret = true;
    //                     break;
    //                 }
    //             }
    //         }
    //     }else if(depth == 2){
    //         if(!sb[pos]){
    //             for(int i=0; i<e[pos].size(); i++){
    //                 if(search((int)(e[pos].get(i)), 3, start)){
    //                     ret = true;
    //                     break;
    //                 }
    //             }
    //         }
    //     }else if(depth == 3){
    //         if(!sb[pos]){
    //             for(int i=0; i<e[pos].size(); i++){
    //                 if((int)(e[pos].get(i)) == start){
    //                     ret = true;
    //                     break;
    //                 }
    //             }
    //         }
    //     }

    //     return ret;
    // }

    // public static boolean search2(int pos, int depth, int start){
    //     boolean ret = false;
    //     if(depth == 0){
    //         for(int i=0; i<e[pos].size(); i++){
    //             if(search2((int)(e[pos].get(i)), 1, start)){
    //                 ret = true;
    //                 break;
    //             }
    //         }
    //     }else if(depth == 1){
    //         if(sb[pos] != sb[start]){
    //             for(int i=0; i<e[pos].size(); i++){
    //                 if(search2((int)(e[pos].get(i)), 2, start)){
    //                     ret = true;
    //                     break;
    //                 }
    //             }
    //         }
    //     }else if(depth == 2){
    //         if(sb[pos] != sb[start]){
    //             if(e[pos].contains(start)) ret = true;
    //         }
    //     }

    //     return ret;
    // }

    public static boolean search3(int pos, int pre, int count, boolean[] visa, boolean[] visb){
        boolean ret = false;
        boolean[] mva = new boolean[n];
        boolean[] mvb = new boolean[n];
        mva = Arrays.copyOf(visa, n);
        mvb = Arrays.copyOf(visb, n);
        if(sb[pos] == sb[pre]){
            if(mva[pos]){
                return true;
            }else{
                mva[pos] = true;
            }
        }else{
            if(mvb[pos]){
                return true;
            }else{
                mvb[pos] = true;
            }
        }
        for(int i=0; i<e[pos].size(); i++){
            int next = (int)(e[pos].get(i));
            if(sb[pos] == sb[pre]){
                if(sb[next] != sb[pos]){
                    if(search3(next, pos, count+1, mva, mvb)) return true;
                }
            }else{
                if(sb[next] == sb[pos]){
                    if(search3(next, pos, count+1, mva, mvb)) return true;

                }
            }
        }
        return ret;
    }
}