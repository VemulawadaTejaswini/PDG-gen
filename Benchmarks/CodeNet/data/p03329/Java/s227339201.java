import java.util.*;

public class Main {
    static int max = 100000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function(n);
    }
    
    private static void function(int n) {
        int [] count = new int [max+1];
        for(int i = 0; i < count.length; i++) {
            count[i] = i;
        }
        List<Integer> list = new ArrayList<>();
        multiply(list,6);
        multiply(list,9);
        
        for(int i = 0; i < count.length; i++) {
            for(int j = 0; j < list.size(); j++) {
                int tmp = list.get(j);
                if(i+tmp <= max) {
                    count[i+tmp] = Math.min(count[i+tmp], count[i]+1);
                }
            }
        }
        System.out.println(count[n]);
    }
    
    private static void multiply(List<Integer> list, int num) {
        int x = num;
        while(x <= max) {
            list.add(x);
            x *= num;
        }
    }
}