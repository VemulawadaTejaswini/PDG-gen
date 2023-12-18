import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < N;i++){
            l.add(Integer.parseInt(sc.next()));
        }
        int previous = Integer.MIN_VALUE;
        for(Integer now : l){
            if(previous <= now - 1){
                previous = now - 1;
            }else if(previous <= now){
                previous = now;
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}