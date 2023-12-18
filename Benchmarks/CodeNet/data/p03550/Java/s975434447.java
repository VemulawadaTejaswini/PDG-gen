import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n,z,w,turn=0;
        n =sc.nextInt();
        z=sc.nextInt();
        w=sc.nextInt();
        for(int a=0;a<n;a++){
            int num = sc.nextInt();
            if(turn ==0){
                if(num>z){
                    z=num;
                    turn =1;
                }
            }
            else if(turn ==1){
                if(num<=w){
                    w=num;
                    turn =0;
                }
            }
        }
        int score = Math.abs(z-w);
        System.out.println(score);
    }
}
