import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();
        int ans = 0;
        int count = 0;
        for(int i=0;i<3;i++){if(s.charAt(i)=='R'){count++;}
                             else{ans=Math.max(ans,count);
                                 count=0;}
                            }        
		System.out.println(Math.max(ans,count));
	}
}