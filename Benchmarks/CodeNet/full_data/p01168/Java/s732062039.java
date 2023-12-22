import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
	while(true){
	String[] st = sc.readLine().split(" ");
	int a = Integer.valueOf(st[0]),b = Integer.valueOf(st[1]),c = Integer.valueOf(st[2]);
	if(a==-1 && b==-1 && c==-1)
		break;
	
	boolean flag = false;
	root:
	for(int i=2; i<16; i++){
		String p = Integer.toString(a, i);
		if(p.matches("[0-9]+")){
			int num = Integer.valueOf(p);
			if(num==b){
				flag = true;
				break root;
			}
		}
	}
	
	int min = 1000000000;
	for(int i=2; i<=16; i++){
		String p = Integer.toString(c, i);
		if(p.matches("[0-9]+")){
			int num = Integer.valueOf(p);
			if(num >= c-a+b)
				min = Math.min(min, num);
		}
	}
	if(flag)
	System.out.println(min);
	else
	System.out.println(-1);
	}
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}