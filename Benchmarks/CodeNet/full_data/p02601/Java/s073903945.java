import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();int k=sc.nextInt();
        int tmp=0;
        while(b<=a){
                b*=2;
                tmp++;
            }
        while(c<=b){
                c*=2;
                tmp++;
            }
        if (tmp<=k)
            System.out.println("Yes");
        else
            System.out.println("No");



    }
    }
