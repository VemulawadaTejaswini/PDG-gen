import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        int N = sc.nextInt();
        int num = 0;
        int min = 999999999;
        for(int i=0;i<N;i++){
            int num2 = sc.nextInt();
            num+=num2;
            List.add(num);
        }
        for(int i:List){
            int s1 = num-i;
            int s2 = num -s1;
            int num2 = Math.abs(s1-s2);
            if(min>num2) min = num2;
        }
        System.out.println(min);
    }
}
