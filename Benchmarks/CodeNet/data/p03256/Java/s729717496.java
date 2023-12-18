import java.util.*;

public class Main {
    public static ArrayList[] e;
    public static boolean[] sb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        sb = new boolean[n];
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

        for(int i=0; i<n; i++){
            if(search(i, 0, i)){
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }

    public static boolean search(int pos, int depth, int start){
        boolean ret = false;
        if(depth == 0){
            if(sb[pos]){ 
                for(int i=0; i<e[pos].size(); i++){
                    if(search((int)(e[pos].get(i)), 1, start)){
                        ret = true;
                        break;
                    }
                }
            }
        }else if(depth == 1){
            if(sb[pos]){
                for(int i=0; i<e[pos].size(); i++){
                    if(search((int)(e[pos].get(i)), 2, start)){
                        ret = true;
                        break;
                    }
                }
            }
        }else if(depth == 2){
            if(!sb[pos]){
                for(int i=0; i<e[pos].size(); i++){
                    if(search((int)(e[pos].get(i)), 3, start)){
                        ret = true;
                        break;
                    }
                }
            }
        }else if(depth == 3){
            if(!sb[pos]){
                for(int i=0; i<e[pos].size(); i++){
                    if((int)(e[pos].get(i)) == start){
                        ret = true;
                        break;
                    }
                }
            }
        }

        return ret;
    }
}