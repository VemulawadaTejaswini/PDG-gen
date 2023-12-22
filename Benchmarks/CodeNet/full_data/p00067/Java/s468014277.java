import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String st;
	    while((st=sc.readLine())!=null){
		int[][] map = new int[14][14];
		int count = 0;
		for(int i=1; i<=12; i++)
		    map[1][i] = st.charAt(i-1) - '0';
		for(int j=2; j<=12; j++){
		    st = sc.readLine();
		    for(int i=1; i<=12; i++)
			map[j][i] = st.charAt(i-1) - '0';
		}
		for(int j=1; j<=12; j++)
		    for(int i=1; i<=12; i++)
			if(map[j][i]==1){
			    solve(map, j, i);
			    count++;
			}
		System.out.println(count);
		st = sc.readLine();
		if(st == null)
		    break;
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
    
    private static void solve(int[][] map, int j, int i){
	if(map[j][i]==0)
	    return;
	map[j][i] = 0;
	solve(map, j, i+1);
	solve(map, j, i-1);
	solve(map, j+1, i);
	solve(map, j-1, i);
    }
}