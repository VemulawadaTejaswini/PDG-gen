import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack st1 = new Stack();
        Stack st2 = new Stack();
        
        for(int i = 0; i < n; i++) {
            if(i == n - 1) {
                if(n % 2 == 0) {
                    st2.push(scan.nextInt());
                } else {
                    st1.push(scan.nextInt());
                }
                break;
            }
            
            if(i % 2 == 0) {
                st1.push(scan.nextInt());
                while(!st1.empty()) {
                    st2.push((int)st1.pop());
                }
            } else {
                st2.push(scan.nextInt());
                while(!st2.empty()) {
                    st1.push((int)st2.pop());
                }
            }
        }
        
        if(n % 2 == 0) {
            while(!st2.empty()) {
                int value = (int)st2.pop();
                if(!st2.empty()) System.out.print(value + " ");
                else System.out.println(value);
            }
        } else {
            while(!st1.empty()) {
                int value = (int)st1.pop();
                if(!st1.empty()) System.out.print(value + " ");
                else System.out.println(value);
            }
        }
    }
}
