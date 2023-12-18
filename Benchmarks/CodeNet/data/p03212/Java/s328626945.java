import java.util.Scanner;

public class Main {
    static int count = 0;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        dfs(0,0);
        System.out.println(count);
        sc.close();
    }

    public static void dfs(long val,int flag){
        if(val > n)return;
        if(flag == 7)count++;

        dfs(val*10+3,flag | 1);
        dfs(val*10+5,flag | 2);
        dfs(val*10+7,flag | 4);
    }


    
}