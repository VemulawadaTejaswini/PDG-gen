import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        int p = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        System.out.println(a);
        int notCount = 0;
        for (int i=0;i<n-p;i++){
            Integer max = a.get(i)+m;
            // i番目の数字は選べれうるのか?
            Integer eq_index = a.indexOf(max);
            // あと+するv-1-i個をどうするか
            int sum = (int)a.stream().filter(x -> x>max).count();
            int p_t = p-sum;
            int v_t = v-1-i-(int)sum;
            
            if(p_t<=0){
                notCount++;
                continue;
            }
            if(v_t<=0){
                continue;
            }
            if(p_t>v_t && eq_index < i+p_t && i+p_t<n-sum){
                notCount++;
            }
        }
        System.out.println(n-notCount);
    }
}
