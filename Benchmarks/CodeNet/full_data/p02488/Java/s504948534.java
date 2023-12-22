import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
	int n = Integer.valueOf(sc.readLine());
	String map[] = new String[n];
	for(int i=0; i<n; i++)
		map[i] = sc.readLine();
	Arrays.sort(map);
	System.out.println(map[0]);
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}