import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sss =sc.nextInt();
        int a = sc.nextInt();
        int sum=0;
        for(int i=0;i<a;i++){
            int b = sc.nextInt();
            sum+=b;
            }
        if(sss<sum){
            System.out.println(-1);
        }
        else{
            System.out.println(sss-sum);
        }
        }

    }
