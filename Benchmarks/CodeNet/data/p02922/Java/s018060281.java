import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a;
        int count=1;
        while(a<b){
            a=a+c-1;
            count++;
        }
        if(a>=b){
            System.out.println(count);
        }
    }
    
}
