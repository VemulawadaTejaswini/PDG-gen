import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int list [] = new int[n];
        if(m>n) System.out.println(-1);
        else {
            Arrays.fill(list,0);
            boolean check = true;
            for (int i = 0; i < m; i++) {
                int s = sc.nextInt();
                int c = sc.nextInt();
                if(list[s-1]!=0&&c!=list[s-1]){
                    check = false;
                    break;
                }
                list[s-1]=c;
            }
            if(list[0]==0||check==false) System.out.println(-1);
            else {
                StringBuilder opt = new StringBuilder();
                for (int i : list) opt.append(i);
                System.out.println(opt);
            }
        }
    }
}