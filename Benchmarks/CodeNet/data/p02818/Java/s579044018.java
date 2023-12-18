import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 入力値
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
        sc.close();
        if(k>=a){
            k-=a;
            a=0;
            if(k>=b){
                k-=b;
                b=0;
            }else{
                b-=k;
            }
        }else{
            a-=k;
        }
		System.out.println(a+" "+b);
    }
}