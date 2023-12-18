import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        long k = sc.nextLong();       
		String [] in = new int [n];    
        for(int i=0;i<n;i++){
                             in[i] = sc.next();
                            }
        String ans = "Yes";
        int l = 0;
        int r = 0;
        int L = 0;
        int R = 0;
        for(int i=0;i<n;i++){l=0;r=0;for(int j=0;j<in[i].length();j++){if(in[i].charAt(j)=='('){l++;L++;}
                                                                       else{r++;R++;}
                                                              
                                                                      }
                             if(l==r){ans = "No";}
                            }
        if(R!=L){ans="No";}
		System.out.println(ans);
}
}
