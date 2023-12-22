import java.util.*;
public class Main{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double m, a2;
        int s[] = new int[1000];
        while(true){
        	n = sc.nextInt();
        	if(n == 0)break;
        	m = 0;
        	a2 = 0; 
        	for(int i = 0; i < n; i++){
        		s[i] = sc.nextInt();
        		m += s[i];
        	}
        	m = m/ n;
        	for(int i = 0; i < n; i++){
        		a2 += (s[i] - m)*(s[i] - m) / n;
        	}
        	System.out.printf("%.8f\n",Math.sqrt(a2));
        }
    }
 
}