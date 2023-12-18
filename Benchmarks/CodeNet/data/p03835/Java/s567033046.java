import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        int S = Integer.parseInt(sc.next());
        int count = 0;
        for(int x=0; x <= K &&  x <= S; x++){
            for(int y=0; y <= K && y <= S; y++){
                for(int z = 0; z <= K && z <= S; z++){
                    if(S == x + y + z){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}