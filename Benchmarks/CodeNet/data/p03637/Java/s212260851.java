import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count4 = 0;
        int count1 = 0;
        for(int i=0;i<N;i++){
            int a = scan.nextInt();
            if(a%4 == 0) count4++;
            else if(a%2 == 1) count1++;
        }
        if(count4<count1){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}