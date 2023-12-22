import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String line = sc.nextLine();
            if(line.equals("0")) {
                break;
            }
            int n = Integer.parseInt(line);
            String line1 = sc.nextLine();
            String[] line1sp = line1.split(" ");
            int[] nums = new int[n];
            double sum = 0;
            double av = 0;
            for(int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(line1sp[i]);
                sum += nums[i];
            }
            av = sum / n;
            double x = 0;
            for(int i = 0; i < n; i++) {
                x += Math.pow(nums[i] - av, 2);
            }
            
            double delta = Math.sqrt(x / n);
            System.out.println(delta);
        }   
       
    
    }
 }
