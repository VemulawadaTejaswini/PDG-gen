import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int min = 300001;
        for(int m=0; m<n; m++){
            int w =0;
            int e =0;
            for(int i =0; i<m; i++){
                if(c[i]=='W') w++;
            }
            for(int i=n-1; i>m; i--){
                if(c[i]=='E') e++;
            }
            min = Math.min(min,w+e);
        }
        System.out.println(min);
    }
}
