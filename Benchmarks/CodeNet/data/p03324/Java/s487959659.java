import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(),n=sc.nextInt();
        int start = 1;
        for(int i =0;i<d;i++){
            start *= 100;
        }
        int ans = start;
        for(int i = 1;i<n;i++){
            ans += start;
        }
        System.out.println(ans);
    }
}
