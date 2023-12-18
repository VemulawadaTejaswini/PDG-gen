import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);  
        sc.nextLine();
        String[] line=sc.nextLine().trim().split(" ");
        long[] px=Arrays.stream(line).mapToLong(Long::parseLong).toArray();
        line=sc.nextLine().trim().split(" ");
        long[] py=Arrays.stream(line).mapToLong(Long::parseLong).toArray();
        long mod=1000000007;
        long wx=0;
        long wy=0;
        for(int i=0; i<px.length; i++){
	    	for(int j=i+1; j<px.length; j++){
	    		wx+=(px[j]-px[i])%mod;
	    	}
        }
	    for(int i=0; i<py.length; i++){
	    	for(int j=i+1; j<py.length; j++){
	    		wy+=(py[j]-py[i])%mod;
	    	}
        }
        
        System.out.println((wy*wx)%mod);
    }
}
