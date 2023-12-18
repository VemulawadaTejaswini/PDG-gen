import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cp_n = n;
        int sum = 0;
        String ns = ""+n;
        for(int i=(int)(Math.pow(10,ns.length()-1)); i>=10; i/=10){
            sum += n/i;
            n = n-n/i*i;
        }
        sum += n;
        if(cp_n%sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}