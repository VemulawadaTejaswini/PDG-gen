import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data[][] = new int[n][3];
        for(int i=0; i<n; i++){
            data[i][0] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            data[i][1] = sc.nextInt();
            data[i][2] = data[i][0] - data[i][1];
        }

        for(int i=0; i<n; i++){
            if(data[i][0] < data[i][1] * 2 && data[i][0] != data[i][1]){
                System.out.println("-1");
                return;
            }
        }

        ArrayList[] adata = new ArrayList[50];
        for(int i=0; i<50; i++){
            adata[i] = new ArrayList<Integer>();
            for(int j=1; j<=i+1; j++){
                if((i+1) % j == 0){
                    adata[i].add(j);
                }
            }
        }

        ArrayList<Integer> use = new ArrayList<Integer>();

        Comp comp = new Comp();
        comp.set_index(1);
        Arrays.sort(data, comp);
        
        out: for(int i=0; i<n; i++){
            if(data[i][2] == 0) continue;
            if(data[i][1] == 0){
                if(use.size()== 0){
                    use.add(1);
                }
                continue;
            }
            for(int j=0; j<adata[data[i][2]-1].size(); j++){
                int tmp = (int)adata[data[i][2]-1].get(j);
                if(use.contains(tmp) && tmp > data[i][1]) continue out;
            }
            for(int j=0; j<adata[data[i][2]-1].size(); j++){
                int tmp = (int)adata[data[i][2]-1].get(j);
                if(tmp > data[i][1]){
                    use.add(tmp);
                    continue out;
                }
            }
        }

        long ans = 0;
        for(int i=0; i<use.size(); i++){
            ans += Math.pow(2, use.get(i));
        }
        System.out.println(ans);
    }
}


class Comp implements Comparator {

    int index = 0;

    void set_index (int i) {
        index = i;
    }

    public int compare (Object a, Object b) {
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return (int_b[index] - int_a[index]);
    }

}