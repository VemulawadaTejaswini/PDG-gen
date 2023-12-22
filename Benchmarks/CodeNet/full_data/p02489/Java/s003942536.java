import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        int x;
        Scanner sc = new Scanner(System.in);
 
        for(int i = 1; ;i++){
            x = sc.nextInt();
            if(x != 0){
                System.out.printf("Case %d: %d\n", i, x);
            }else{
                break;
            }
        }
    }
}