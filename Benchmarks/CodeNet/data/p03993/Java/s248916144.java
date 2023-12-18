
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	int N=sc.nextInt();
	int ar[]=new int[N];
	for (int i = 0; i < N; i++) {
	    ar[i]=sc.nextInt();
	}
	int ans=0;
	for (int i = 0; i < N; i++) {
	    
	    if (ar[ar[i]-1]==i+1) {
		
		ans++;
	    }
	}
	System.out.println(ans/2);
	
    }


 
    
    
}
