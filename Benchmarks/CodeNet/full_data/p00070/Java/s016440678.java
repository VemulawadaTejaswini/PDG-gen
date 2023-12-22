import java.io.*;
import java.util.*;

class Main{
    static int s, n, sum, all;
    static TreeSet<Integer> sap;
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    while((st=sc.readLine())!=null){
		String[] sp = st.split(" ");
		n = Integer.valueOf(sp[0]);
		s = Integer.valueOf(sp[1]);
		all = 0; sum = 0; sap = new TreeSet<Integer>();
		solve(1);
		System.out.println(all);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
    static void solve(int a){
	if(sum>s)
	    return;
	else if(a==n+1 && sum==s)
	    all++;
	else{
	    for(int i=0; i<=9; i++){
		if(!sap.contains(i)){
		    sap.add(i);
		    sum+=i*a;
		    solve(a+1);
		    sum-=i*a;
		    sap.remove(i);
		}
	    }
	}
    }
}