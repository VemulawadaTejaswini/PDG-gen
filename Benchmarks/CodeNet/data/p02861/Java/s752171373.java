import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n_town = Integer.parseInt(sc.next());
        int[][] xys= new int[n_town][2];
        
        for(int i=0;i<n_town;i++){
            xys[i][0] = Integer.parseInt(sc.next());
            xys[i][1] = Integer.parseInt(sc.next());
        }
        
        
        //String s = sc.next();
        
        
        ArrayList<Integer> a_perm = new ArrayList<Integer>(n_town);
        
        for(int i=1; i<=n_town; i++){
            a_perm.add(i);
        }
        
        double sum=0;
        int a=0, b=0;
        for(int j=1; j<n_town; j++){
            a = a_perm.get(j-1)-1;
            b = a_perm.get(j)-1;
            sum+=Math.sqrt((xys[a][0]-xys[b][0])*(xys[a][0]-xys[b][0]) + (xys[a][1]-xys[b][1])*(xys[a][1]-xys[b][1]));
        }
        
        for(int i=1; i<factorial(n_town); i++){
            a_perm = nextPerm(a_perm);
            
            for(int j=1; j<n_town; j++){
                a = a_perm.get(j-1)-1;
                b = a_perm.get(j)-1;
                sum+=Math.sqrt((xys[a][0]-xys[b][0])*(xys[a][0]-xys[b][0]) + (xys[a][1]-xys[b][1])*(xys[a][1]-xys[b][1]));
            }
        }
        sum /= factorial(n_town);
        System.out.println(sum);
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