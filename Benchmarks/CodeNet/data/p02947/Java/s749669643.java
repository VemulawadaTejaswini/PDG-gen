import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long ans = 0;
		String in = new String [n];       
        for(int i=0;i<n;i++){in[i] = sc.next();
                            Arrays.sort(in[i]);
                            }
        Arrays.sort(in);                   
         int count = 0;
        for(int i=1;i<n;i++){if(in[i].equals(in[i-1])){count++;}
                                else{ans+=count;count=0;}
                            }
        ans+=count;                        
		System.out.println(ans);
}
}