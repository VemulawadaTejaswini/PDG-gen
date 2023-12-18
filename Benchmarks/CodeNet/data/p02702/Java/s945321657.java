import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int l = s.length();
        long [] in = new long [l];
        long mod = 2019;
        long ans = 0;
        long a = 0;
        if(l>=5){
        for(int i=0;i<l-4;i++){
        for(int j=5;j<=l-i;j++){if(j==5){a = Long.parseLong(s.substring(i,i+j));}
            else{a=a*10+Long.parseLong(s.substring(i+j-1,i+j));}
            j++;a%=mod;
            if(a==0){ans++;}}                                       
        }
                            }      
		System.out.println(ans);
	}
}