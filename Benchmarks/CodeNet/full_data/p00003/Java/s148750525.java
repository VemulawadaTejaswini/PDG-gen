import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int[] num = new int[3];
        for(int i = 0; i < z; i++){
            for(int j = 0; j < num.length; j++){
                num[j] = sc.nextInt();
            }
            Arrays.sort(num);
            if(num[0]*num[0] + num[1]*num[1] == num[2]*num[2]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}