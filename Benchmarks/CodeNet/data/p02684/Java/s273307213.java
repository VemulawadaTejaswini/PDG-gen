import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        list.add(a[0]);
        int num = 0;
        while(true){
            int i = list.get(list.size() - 1);
            if(a[i - 1] == 1){
                break;
            }
            else if(list.contains(a[i - 1])){
                num = list.indexOf(a[i - 1]);
                break;
            }
            list.add(a[i - 1]);
        }

        long r = (k - num) % ((long)list.size() - num);
        System.out.println(list.get((int)r));
    }
}