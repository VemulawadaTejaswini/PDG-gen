import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> fun(int n){
        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(2);
        for(int i = 3;i < n ;i++){
            boolean flag = true;
            for(Integer num : prime){
                if(i%num==0){
                    flag = false;
                    break;
                }
            }
            if(flag){prime.add(i);}
        }
        return prime;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        ArrayList<Integer> prime_l = fun(N);
        while(true){
            boolean a = true;
            for(Integer p_num : prime_l){
                if(N%p_num==0){
                    a = false;
                    break;
                }
            }
            if(a || N == 2){
                System.out.println(N);
                break;
            }
            N++;
        }
    }
}