import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        for(int i = 1; i <= M; i++) {
            System.out.println(i+" "+(2*M+1-i));
        }
    }
}