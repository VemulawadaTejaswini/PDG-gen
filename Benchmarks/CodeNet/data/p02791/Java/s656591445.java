import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int n = stdIn.nextInt();
        int min = 10000000;
        int count = 0;
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        int p[] = new int[n];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        
        //c[0] += 1;
        //int sum = 0;
        //boolean flag = true;
        for(int i = 0; i < n; i++){
            p[i] = stdIn.nextInt();
            
            if(min >= p[i]){
                count++;
                min = p[i];
            }
        }
        
        
        System.out.println(count);
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}