import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] od = new int[100000];
        int[] ev = new int[100000];
        int[] p = new int[4];
        int[] q = new int[4];
        for(int i = 0; i < n/2;i++){
            int ai = sc.nextInt();
            od[ai]++;
            if(q[0] < od[ai]){
                if(p[0] != ai){   
                    p[1] = p[0];    q[1] = q[0];
                }
                p[0] = ai;  q[0] = od[ai]; 
            }else if(q[1] < od[ai]){
                p[1] = ai;   q[1] = od[ai];   
            }
            ai = sc.nextInt();
            ev[ai]++;
            if(q[2] < ev[ai]){
                if(p[2] != ai){
                    p[3] = p[2];    q[3] = q[2];
                }
                p[2] = ai;   q[2] = ev[ai];
            }else if(q[3] < ev[ai]){
                p[3] = ai;   q[3] = ev[ai];
            }
        }
        if(p[0] != p[2])    System.out.println(n-q[0]-q[2]);
        else System.out.println(Math.min((n-q[0]-q[3]), (n-q[1]-q[2])));
    }
}