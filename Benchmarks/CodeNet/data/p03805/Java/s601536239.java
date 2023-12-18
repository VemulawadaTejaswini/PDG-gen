import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n_vertex = Integer.parseInt(sc.next());
        int n_path = Integer.parseInt(sc.next());
        boolean[][] connected = new boolean[n_vertex][n_vertex];
        for(int i=0; i<n_vertex; i++){
            for(int j=0; j<n_vertex; j++){
                connected[i][j]=false;
            }
        }
        int a=0, b=0;
        for(int i=0; i<n_path; i++){
            a = Integer.parseInt(sc.next())-1;
            b = Integer.parseInt(sc.next())-1;
            connected[a][b]=true;
            connected[b][a]=true;
        }
        
        ArrayList<Integer> a_perm = new ArrayList<Integer>(n_vertex);
        
        for(int i=1; i<=n_vertex; i++){
            a_perm.add(i);
        }
        
        int count=0;
        boolean all_ok = true;
        for(int i=1; i<n_vertex; i++){
            if(!connected[a_perm.get(i-1)-1][a_perm.get(i)-1]) all_ok=false;
        }
        if(all_ok) count++;
        
        
        for(int i=1; i<factorial(n_vertex-1); i++){
            a_perm = nextPerm(a_perm);
            all_ok = true;
            for(int j=1; j<n_vertex; j++){
                if(!connected[a_perm.get(j-1)-1][a_perm.get(j)-1]) all_ok=false;
            }
            if(all_ok) count++;
        }
        
        System.out.println(count);
    }
    
    private static ArrayList<Integer> nextPerm(ArrayList<Integer> former){
        int pivot=-1;
        int ln = former.size();
        for(int i = ln; i>1; i--){
            if(former.get(i-2) < former.get(i-1)){
                pivot = i-2;
                break;
            }
        }
        if(pivot==-1) return null;
        int pivot_fig = former.get(pivot);
        
        int min_pos=pivot+1;
        int min=former.get(min_pos);
        for(int i=ln-1; i > pivot+1; i--){
            if((former.get(i) < min)&&(former.get(i) > pivot_fig)){
                min_pos=i;
                min=former.get(min_pos);
            }
        }
        Collections.swap(former, pivot, min_pos);
        Collections.sort(former.subList(pivot+1, ln));
        return former;
        
    }
    private static int factorial(int n) {
        int ans=1;
        for(int i=n; i>0; i--){
            ans*=i;
        }
        return ans;
    }
}