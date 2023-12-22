import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long pro=1;
        for (int i = 1; i <=n; i++) {
            long h2=sc.nextLong();
            pro=pro*h2;
        }
        if(pro>(long)Math.pow(10,18)) {
            System.out.println("-1");
        }else {
            System.out.println(pro);
        }


    }
}



