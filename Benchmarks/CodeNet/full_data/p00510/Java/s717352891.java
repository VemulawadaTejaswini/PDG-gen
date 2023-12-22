import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
        int n = Integer.valueOf(sc.readLine());
		int inside = Integer.valueOf(sc.readLine());
		int max = inside, flag = 0;
		for(int i=0; i<n; i++){
			String[] st = sc.readLine().split(" ");
			int now = Integer.valueOf(st[0])-Integer.valueOf(st[1]);
			inside+=now;
			max = Math.max(max,inside);
			if(inside<0)
				flag = 1;
		}
		if(flag==1)
			System.out.println(0);
		else
			System.out.println(max);
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}