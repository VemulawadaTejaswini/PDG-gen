import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n_v = Integer.parseInt(sc.next());
        int queri_n = Integer.parseInt(sc.next());
        ArrayList<ArrayList<Integer>> plain_graph = new ArrayList<>(n_v);
        
        for(int i=0; i<n_v; i++){
            ArrayList<Integer> null_arr = new ArrayList<>(0);
            plain_graph.add(null_arr);
        }
        
        int a = -1, b = -1;
        for(int i=1; i<n_v; i++){
            a = Integer.parseInt(sc.next())-1;
            b = Integer.parseInt(sc.next())-1;
            plain_graph.get(a).add(b);
            plain_graph.get(b).add(a);
        }
        
        ArrayList<ArrayList<Integer>> null_arrX2 = new ArrayList<>(n_v);
        for(int i=0; i<n_v; i++){
            ArrayList<Integer> null_arr = new ArrayList<>(0);
            null_arrX2.add(null_arr);
        }
        
        ArrayList<ArrayList<Integer>> brunch_dt = know_brunch(plain_graph, -1, 0);
        for(int i=0; i<n_v; i++){
            System.out.print(i + ":");
            for(int j=0; j<brunch_dt.get(i).size(); j++){
                System.out.print(brunch_dt.get(i).get(j));
            }
            System.out.println();
        }
        int[] counter = new int[n_v];
        for(int i=0; i<n_v; i++){
            counter[i] = 0;
        }
        
        int root_tmp = -1, addition = -1;
        for(int i=0; i<queri_n; i++){
            root_tmp = Integer.parseInt(sc.next())-1;
            addition = Integer.parseInt(sc.next());
            counter = add_all_by_part(brunch_dt, counter, root_tmp, addition);
        }
        System.out.print(counter[0]);
        for(int i=1; i<n_v; i++){
            System.out.print(" " + counter[i]);
        }
        System.out.println();
    }
    
    static int[] add_all_by_part(ArrayList<ArrayList<Integer>> brunch_dt, int[] counter_former, int root_to_add, int amount_to_add){
        counter_former[root_to_add] += amount_to_add;
        for(int i=0; i<brunch_dt.get(root_to_add).size(); i++){
            counter_former = add_all_by_part(brunch_dt, counter_former, brunch_dt.get(root_to_add).get(i), amount_to_add);
        }
        
        return counter_former;
    }
    
    static ArrayList<ArrayList<Integer>> know_brunch(ArrayList<ArrayList<Integer>> plain_graph, int its_root, int now_pos){
        
        int n_brunch = plain_graph.get(now_pos).size() -1, tmp = -1;
        
        for(int i=0; i<=n_brunch; i++){
            tmp = plain_graph.get(now_pos).get(i);
            if(tmp != its_root){
                plain_graph = know_brunch(plain_graph, now_pos, tmp);
            }else{ 
                plain_graph.get(now_pos).remove(i);
                i--;
                n_brunch--;
            }
        }
        
        return plain_graph;
    }
    
    /*
    static boolean[][] bfs(boolean[][] state, boolean[][] seen, int x, int y){
        int[] tmpltX = {1,-1,0,0};
        int[] tmpltY = {0,0,1,-1};
        int newX = -1, newY = -1;
        
        seen[y][x] = true;
        for(int i=0; i < 4; i++){
            newX = x+tmpltX[i];
            newY = y+tmpltY[i];
            if((newX >= 0) && (newY >= 0) && (newX < seen[0].length) && (newY < seen.length) && (!seen[newY][newX]) && state[newY][newX]) seen = bfs(state, seen, newX, newY);
        }
        return seen;
    }
    
    public static int binarySearchMax(int[] dt, int target){
        int left=-1, right=dt.length;
        int mid=-1;
        
        while((right-left)>1){
            mid = left + (right-left)/2;
            
            if(dt[mid] <= target){
                left=mid;
            }else{
                right=mid;
            }
        }
        return left+1;
    }*/
}