import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(k - b > 0){
                k -= b;
                k++;
            }
            list.add(a);
        }
        //System.out.println(k);
        //System.out.println(list);
        System.out.println(list.get(k-1));
    }
}
