import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
		sc.close();
		int ans = 1;
        while(true){
            x = x*2;
            if(x > y){
                break;
            }else{
                ans++;
            }
        }
        System.out.println(ans);
	}
}
