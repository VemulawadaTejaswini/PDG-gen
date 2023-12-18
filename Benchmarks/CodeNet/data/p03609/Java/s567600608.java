import java.util.Scanner;
     
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int X = sc.nextInt();
            int t = sc.nextInt();
            int C = 0;
            int ans = X - t;
            
        	if(X >= t){
	            System.out.println(C);
        }else{
            System.out.println(ans);
    }
        }
    }
    