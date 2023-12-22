import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x;
        int sum=0,i=0,j;
        String t;
        Scanner s = new Scanner(System.in);
        while(true){
            t = s.next();
            x = Integer.parseInt(t);
            if(x ==0)break;
            while(x!=0){
                sum+=x%10;
                x/=10;
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
