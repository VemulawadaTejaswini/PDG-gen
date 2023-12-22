import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> input = new ArrayList<>();
        int a = 0, k = 0, sum = 0;
        for(int i = 0; i < n; i++){
            a = sc.nextInt();
            if(i == 0){
                input.add(a);
            } else {
                while(k < input.size() && a < input.get(k)){
                    k++;
                }
                input.add(k, a);
                k = 0;
            }
        }
        for(int i = 1; i < n; i++){
            sum += input.get(i / 2);
        }
        System.out.println(sum);
        sc.close();
    }
}