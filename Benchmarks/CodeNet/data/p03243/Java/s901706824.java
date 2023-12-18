import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        int max=-1;
        while(n>0){
            int rem=n%10;
            max=Math.max(rem,max);
            n/=10;
        }
        for(int i=0;i<s.length();i++){
            System.out.print(max);
        }
    }
}