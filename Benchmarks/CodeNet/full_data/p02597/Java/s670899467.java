import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int w = 0;
        int r = 0;
		String s = sc.next();      
        for(int i=0;i<a;i++){if(s.charAt(i)=='R'){r++;}
                            }   
        int ans = r;     
        for(int i=0;i<a;i++){if(s.charAt(i)=='W'){w++;}
                             else{r--;}
                            ans=Math.min(ans,Math.max(w,r));
                            }        
		System.out.println(ans);
	}
}
