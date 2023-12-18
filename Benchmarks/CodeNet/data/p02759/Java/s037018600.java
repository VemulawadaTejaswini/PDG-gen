import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean ans = true;
        
        int digit = Integer.parseInt(sc.next());
        
        int[] num = new int[digit];
        
        for(int t = 0; t < digit; t++) {
            num[t] = -1;
        }
        
        int n_cmd = Integer.parseInt(sc.next());
        
        int ad = -1, fig = -1;
        
        for(int t = 0; t < n_cmd; t++) {
            ad = Integer.parseInt(sc.next());
            ad--;
            fig = Integer.parseInt(sc.next());
            if((num[ad] == -1) || (num[ad] == fig)) {
                num[ad] = fig;
            } else {
                ans = false;
            }
        }
        
        if(num[0] == -1) {
            num[0] = 1;
        } else if(num[0] == 0) {
        	if(digit > 1){
	            ans = false; 
            }
        }    
        
        for(int t = 1; t < digit; t++) {
            if(num[t] == -1) {
                num[t] = 0;
            }
        }
        
        if(ans) {
            int sum = 0;
            for(int t = 0; t < digit; t++) {
                num[t] *= Math.pow(10,(digit-t-1));
                sum += num[t];
            }
            System.out.println(sum);
        } else {
            System.out.println("-1");
        }
    }
}