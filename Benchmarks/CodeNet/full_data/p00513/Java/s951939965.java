import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
	int num=0, n = Integer.valueOf(sc.readLine());
	for(int i=0; i<n; i++){
		int nn = Integer.valueOf(sc.readLine());
		boolean flag = false;
		root:
		for(int j=3; j<nn/3; j+=2)
			if(nn%j==0){
				flag = true;
				break root;
			}
		if(flag)
			num++;
		}
	System.out.println(num);
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}