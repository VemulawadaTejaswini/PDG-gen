import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String[] str = sc.next().split("");
        str[K-1] = str[K-1].toLowerCase();
        for(String x:str){
            System.out.print(x);
        }
    }
}