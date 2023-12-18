
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
   
    static class aa{
	int r=1;	boolean t=false;
    }
    
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int N=sc.nextInt();
	int M=sc.nextInt();	
	
	aa[] a=new aa[N];
	for (int i = 0; i < N; i++) {
	    a[i]=new aa();
	}
	a[0].t=true;
	int aaaa=1;
	for (int i = 0; i < M; i++) {
	    int x=sc.nextInt();	    int y=sc.nextInt();

	    
	    if(a[x-1].t){
		if(!a[y-1].t){
		a[y-1].t=true;
		aaaa++;}
	    }
	    a[x-1].r--;
	    a[y-1].r++;
	    
	    if( a[x-1].r==0){
		if(a[x-1].t)
		    aaaa--;
		a[x-1].t=false;
		
	    }
	    
	    
		
	
	}
	
	System.out.println(aaaa);
    }
}