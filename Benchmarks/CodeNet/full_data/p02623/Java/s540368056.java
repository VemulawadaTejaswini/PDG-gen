import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0; i < n; i++) a.add(scan.nextInt());
        for(int i = 0; i < m; i++) b.add(scan.nextInt());
        int out = -1;
        long sum = 0;
        while(sum < k){
            if(a.size() != 0 && b.size() != 0){
                if(a.get(0) <= b.get(0)){
                    sum += a.get(0);
                    a.remove(0);
                }else{
                    sum += b.get(0);
                    b.remove(0);
                }
            }else if(a.size() == 0){
                sum += b.get(0);
                b.remove(0);
            }else{
                sum += a.get(0);
                a.remove(0);
            }
            out++;
        }
        System.out.println(a.size() == 0 || b.size() == 0 ? out + 1 : out);
        scan.close();
    }
}