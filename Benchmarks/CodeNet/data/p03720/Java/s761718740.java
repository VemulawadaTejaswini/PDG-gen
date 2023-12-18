import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int town = sc.nextInt();
        int road = sc.nextInt();
        int[] num = new int[road*2];
        int townNum = 1;
        int[] ans = new int[town+1];

        for(int i=0; i<road*2; i++){
            num[i] = sc.nextInt();
        }

        for(int i=0; i<road*2; i++){
            for(int y=0; y<town+1; y++){
                if(y==num[i]){
                    ans[y]++;
                }
            }
        }

        for(int i=1; i<town+1; i++){
            System.out.println(ans[i]);
        }
    }
}