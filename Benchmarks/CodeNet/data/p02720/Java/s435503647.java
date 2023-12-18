import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        ArrayList<Long> luns = new ArrayList<>();
        int count = 0;
        for(int t=1; t<=10; t++){
            for(int i=1; i<=9; i++){
                extend(luns, t, i);        
            }
        }
        System.out.println(luns.get(K-1));

    }
    public static void extend(ArrayList<Long> lis, int len, long val){
        if(len == 1){
            lis.add(val);
            return;
        }
        for(int i=0; i<=9; i++){
            if(Math.abs(val%10 - i) <= 1){
                extend(lis, len-1, val*10+i);
            }
        }
    }
}