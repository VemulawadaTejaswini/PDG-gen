import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = lucas(n);
        System.out.println(ans);
    }
    static int lucas(int a){
        if(a==0) return 2;
        if(a==1) return 1;
        return lucas(a-1) + lucas(a-2); 
    }
}