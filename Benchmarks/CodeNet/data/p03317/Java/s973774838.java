import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int memo = 0;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a==1) memo = i;
        }
        System.out.println((int)(Math.ceil(memo/(k-1))+Math.ceil((n-memo)/(k-1))));
    }
}
