import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
        int m = sc.nextInt();
		int a = 1;
        int b = n-1;
        if(n%2==0){if(m%2==0){a = 2;}else{b = n;}}
        for(int i=0;i<m;i++){System.out.println(a + " " + b);
                             a++;b--;
                            }                         		
	}
}
