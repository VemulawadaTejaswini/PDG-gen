import java.util.*;

public class Main12{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        
        String[] n = N.split("",0);
        int[] l = new int[10];
		
		int b = Integer.parseInt(N);
        
        for(int i=0;i<n.length;i++){
            l[i] = Integer.parseInt(n[i]);
        }
        
		int a = 0;
        for(int j=0;j<n.length;j++){
            a += l[j];
        }
		
		int ans = b % a;
        
        if(ans == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}