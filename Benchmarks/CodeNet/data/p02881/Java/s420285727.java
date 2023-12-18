import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int ans1 = 0;
        int ans2 = 0;
        for(int i = 1; i < a; i++){
            if(a % i == 0){
                list.add(i);
            }
        }
        if(list.size() % 2 == 0){
            ans1 = list.get(list.size() / 2) - 1;
            ans2 = ans1 - 1;
        }else{
            ans1 = list.get(list.size() / 2) - 1;
            ans2 = list.get(list.size() / 2 + 1) - 1;
        }
        System.out.println(ans1 + ans2);
    }
}