import java.util.Scanner;

// 3
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        String s = sc.next();
        
        int count = 0;
        int count_b = 0;
        for(int i = 0; i < N; i++) {
            char c = s.charAt(i);
            
            if(c == 'c') {
            	System.out.println("No");
            	continue;
            }
            
            if(c == 'a') {
            	if(count < (A + B)) {
                	System.out.println("Yes");
                	++count;
                	continue;
            	}else
            		continue;
            }
            
            if(c == 'b') {
            	if(count < (A + B) && count_b <= B) {
            		System.out.println("Yes");
                	++count;
                	++count_b;
                	continue;
            	}else
            		continue;
            }
        }
    }

}
