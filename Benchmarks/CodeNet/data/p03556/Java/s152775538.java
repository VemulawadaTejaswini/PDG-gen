import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int N = Integer.parseInt(scan.next());
        int N = Integer.parseInt(scan.next());
        int tmp = 0;
        for(int i = 1;i<=N;i++){
            if(i*i<=N && tmp<i*i){
                tmp = i*i;
            }
        }
        System.out.println(tmp);
    }
}