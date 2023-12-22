import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long x = Long.parseLong(sc.next());
        
        long[] d = new long[6209];
        for(int i = 0; i < 6209; i++){
            long l = i;
            d[i] = l*l*l*l*l;
        }
        
        long a = 0;
        long b = 0;
        for(int i = 0; i < 6209; i++){
            int left = -1;
            int right = 6208;
            long c = Math.abs(d[i] - x);
            while(right-left > 1){
                int mid = (left + right) / 2;
                if(d[mid] > c){
                    right = mid;
                }else{
                    left = mid;
                }
            }
            if(d[i] - d[left] == x){
                a = i;
                b = left;
                break;
            }
            if(d[i] + d[left] == x){
                a = i;
                b = -left;
                break;
            }
        }
        System.out.println(a + " " + b);
    }
}