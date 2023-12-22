import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int interval = line.indexOf(" ");
        int m = Integer.parseInt(line.substring(0, interval));
        int n = Integer.parseInt(line.substring(interval+1));
        
        int answer=1;
        
        for(int i=0;i<n;i++){       	
        	answer=(answer*m)%1000000007;
        } 
        
        System.out.println(answer);
        
    }   
}