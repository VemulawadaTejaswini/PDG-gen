import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        int cnt = 0;
        int sum;
        for(int ia=0;ia<=a;ia++){
            for(int ib=0;ib<=b;ib++){
                for(int ic=0;ic<=c;ic++){
                    sum = ia*500 + ib*100 + ic*50;
                    if(sum==x){cnt++;}
                }
            }
        }
        System.out.println(cnt);
    }
}