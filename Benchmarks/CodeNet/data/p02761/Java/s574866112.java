import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] answer = new int[N];
        Arrays.fill(answer,-1);
        for(int i = 0 ; i<M ; i++){
            int s = sc.nextInt()-1;
            int c = sc.nextInt();
            if(s == 0 && c == 0 && N != 1){
                System.out.println("-1");
                System.exit(0);
            }
            if(answer[s] == c || answer[s] == -1){
                answer[s]=c;
            }else{
                System.out.println("-1");
                System.exit(0);
            }
        }
        for(int num : answer){
            if(num != -1){
                System.out.print(num);
            }else{
                System.out.print(0);
            }
        }
        System.out.print("\n");
    }
}