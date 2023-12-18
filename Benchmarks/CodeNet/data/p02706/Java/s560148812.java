import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int loop=sc.nextInt();
        for(int i=0;i<loop;i++){
            int d=sc.nextInt();
            a-=d;
        }
        if(a<0){
            System.out.println(-1);
        }
        else {
            System.out.println(a);
        }
        
    }
}
