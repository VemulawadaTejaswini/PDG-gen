import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int per_size = Integer.parseInt(sc.next());
        int[] p_per= new int[per_size];
        int[] q_per= new int[per_size];
        
        for(int i=0; i<per_size; i++){
            p_per[i] = Integer.parseInt(sc.next());
        }
        for(int i=0; i<per_size; i++){
            q_per[i] = Integer.parseInt(sc.next());
        }
        
        
        //String s = sc.next();
        
        int p_pos=factorial(per_size), q_pos=factorial(per_size);
        boolean pidentiy = false, qidentiy = false;
        ArrayList<Integer> a_perm = new ArrayList<Integer>(per_size);
        
        for(int i=1; i<=per_size; i++){
            a_perm.add(i);
        }
        
        for(int i=1; i<factorial(per_size); i++){
            pidentiy = true;
            qidentiy = true;
            for(int j=0; j<per_size; j++){
                if(a_perm.get(j)!=p_per[j]) pidentiy=false;
                if(a_perm.get(j)!=q_per[j]) qidentiy=false;
            }
            if(pidentiy) p_pos=i;
            if(qidentiy) q_pos=i;
            a_perm = nextPerm(a_perm);
        }
        
        System.out.println(Math.abs(p_pos-q_pos));
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