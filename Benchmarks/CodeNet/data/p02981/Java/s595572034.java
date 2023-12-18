import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int cost;

        for(int i = 0; i<=n; i++){
            for(int j = 0; (j+i)==4; j++){
                if(min>(i*a)+(j*b)){
                    min = (i*a)+(j*b);
                }
            }
        }
        System.out.println(min);
    }
}