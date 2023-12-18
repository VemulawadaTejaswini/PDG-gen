import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] arg = new int[n];
        for(int i=0;i<n;i++){
            arg[i] = Integer.parseInt(sc.next());
        }
        int min = cnt(arg[0]);
        if(min>0){
            for(int i=1;i<n;i++){
                int tmp = cnt(arg[i]);
                if(tmp<min){
                    min = tmp;
                }
                if(min==0){break;}
            }
        }
        
        System.out.println(min);
    }
    private static int cnt(int a){
        int cnt = 0;
        while(a%2==0){
            cnt++;
            a=a/2;
        }
        return cnt;
    }
}