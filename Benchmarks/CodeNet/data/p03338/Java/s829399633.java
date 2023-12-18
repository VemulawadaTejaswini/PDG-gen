import java.util.*;
import java.util.stream.Collectors;
 
 
public class Main {
    public static void main(String[] args) {
    	
        Scanner scanner=new Scanner(System.in);
        
        int N = scanner.nextInt();
        String s = scanner.next();
        
        boolean right[] = new boolean[26];
        boolean left[] = new boolean[26];
        int count = 0;
        int ans=0;
        
        
        for(int i=0;i<N;i++){
        	count = 0;
        	
        	if(!right[s.charAt(i)-'a']){
        		
        		right[s.charAt(i)-'a'] = true;
        		
        	
        		for(int j=i+1;j<N;j++){
        			left[s.charAt(j)-'a'] = true;	
        		}
        		
        		for(int j=0;j<26;j++){
        			if(right[j]&&left[j])
        				count++;
        			left[j] = false;
        		}
        	}
        	
        	if(ans<count)
        		ans = count;
        	
        }
        
        System.out.println(ans);
 
 
    }
 
}
