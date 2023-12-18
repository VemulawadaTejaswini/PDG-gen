import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        int a=N/1000%10;
        int b=N/100%10;
        int c=N/10%10;
        int d=N/1%10;
        
        if((a==b&&b==c)||(b==c&&c==d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}