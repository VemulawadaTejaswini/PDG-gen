import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] num = new int[1001];

        for(int i =1;i<1000;i++){
            num[i+1] +=(i+num[i]);
        }
        System.out.println(num[b-a]-a);

        
    }
}
