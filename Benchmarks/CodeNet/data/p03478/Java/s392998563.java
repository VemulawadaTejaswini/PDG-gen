import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for(int i=0; i<=n; i++){
            int temp = i;
            int digSum =0;
            while(temp > 0){
                digSum += n % 10;
                temp /= 10;
            }
            if(a<=digSum && digSum <=b) sum += i;
        }
        System.out.println(sum);
    }
}