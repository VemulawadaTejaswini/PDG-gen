import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a.add(sc.nextInt());
        }
        List<Integer> cnt = new ArrayList<>();
        for(Integer it : a){
            if(it % 2 != 0){
                cnt.add(0);
                continue;
            }
            int x = it / 2;
            cnt.add(x);
        }
        int sum = 0;
        for(Integer it : cnt){
            sum += it;
        }
        System.out.println(sum % 100);
    }
}
