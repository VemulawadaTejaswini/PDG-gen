import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max =0;
        ArrayList<Integer> monster = new ArrayList<>();
        ArrayList<Integer> player = new ArrayList<>();
        for(int i=0;i<N+1;i++) monster.add(sc.nextInt());
        for(int i=0;i<N;i++) player.add(sc.nextInt());
        for(int i=0;i<N;i++){
            int num  =monster.get(i)+monster.get(i+1);
            if(num-player.get(i)>=0) max+=player.get(i);
            else if(num-player.get(i)<0) max+=num;
        }
        System.out.println(max);
    }
}
