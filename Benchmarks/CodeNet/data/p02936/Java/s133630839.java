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

        ArrayList<ArrayList<Integer>> brunch_dt = know_brunch(plain_graph, -1, 0);
        boolean[] whthr_leaf = new boolean[n_v];
        for(int i=0; i<n_v; i++){
            if(brunch_dt.get(i).size() == 0) whthr_leaf[i] = true;
            else whthr_leaf[i] = false;
        }
        
        long[] counter = new long[n_v];
        for(int i=0; i<n_v; i++){
            counter[i] = 0;
        }
        
        int root_tmp = -1, addition = -1;
        for(int i=0; i<queri_n; i++){
            root_tmp = Integer.parseInt(sc.next())-1;
            addition = Integer.parseInt(sc.next());
            counter[root_tmp] += addition;
        }
        counter = add_all_by_part(brunch_dt, counter, 0, whthr_leaf);
        System.out.print(counter[0]);
        for(int i=1; i<n_v; i++){
            System.out.print(" " + counter[i]);
        }
        System.out.println();
    }
    
    static long[] add_all_by_part(ArrayList<ArrayList<Integer>> brunch_dt, long[] counter_former, int root_to_add , boolean[] leaf_dt){
        int tmp=-1;
        for(int i=0; i<brunch_dt.get(root_to_add).size(); i++){
            tmp = brunch_dt.get(root_to_add).get(i);
            counter_former[tmp] += counter_former[root_to_add];
            
            if(!leaf_dt[tmp]) counter_former = add_all_by_part(brunch_dt, counter_former, tmp, leaf_dt);
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
}