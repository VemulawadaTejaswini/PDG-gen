import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
        int m = sc.nextInt();
		int a = 1;
        int b = m;
        if(m%2==0){b = m+1;}        
        for(int i=0;i<m;i++){if(a==b){a=b+1;b=2*m+1;}
                             System.out.println(a + " " + b);
                             a++;b--;                            
                            }                         		
	}
}
