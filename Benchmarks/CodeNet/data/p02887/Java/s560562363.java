import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        
        String[] slimes = str.split("", 0);
        
        int count=0;
        for(int i=0;i<n-1;i++){
            if(! slimes[i].equals(slimes[i+1])){
                count ++;
            }
        }
        
        System.out.println(count+1);
        
    }
}
