import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int e=100000;
        for(int i=0;i<a.length()-2;i++){
            String b=a.substring(i,i+3);
            int c=Integer.parseInt(b);
            int d=c-753;
            e=Math.min(e, Math.abs(d));
        }
        System.out.println(e);
    }
    
}