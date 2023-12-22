import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        int count = 0;
        
        Outer:
        for(int i = 0; i < num; i++){
            int x = sc.nextInt();
            for(int j = 2; j < x; j++){
                if(x % j == 0){
                    continue Outer;
                }
            }
            count++
        }
        System.out.println(count);
    }
}
