import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count;
        for (a ; a<=b;a++){
            if(a%c==0)count++;
        }
        System.out.println(count);
        sc.close();
    }
    
}
