import java.util.Scanner;
    
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int sum = 0,a;
        while(true){
            int t = sc.nextInt();
            if(t == 0){
                break;
            }else{
                int n = sc.nextInt();
            	for(int i = 1; i<=n; i++){
                    int s = sc.nextInt();
                    int f = sc.nextInt();
                    
                    sum += f - s;
                }
                if(sum >= t){
                	System.out.println("OK");
            	}else{
                	a = t -sum;
                	System.out.println(a);
            	}
                sum = 0;
            }
            
        }
        sc.close();
    }
}
