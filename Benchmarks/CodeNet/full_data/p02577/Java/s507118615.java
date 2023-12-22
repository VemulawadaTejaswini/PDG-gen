import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long t=0;
        long sum=0;
        while (t<s.length()){
            int num=Integer.parseInt(String.valueOf(s.charAt((int) t)));
            sum=sum+num;
            t++;
        }
        if (sum%9==0){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
