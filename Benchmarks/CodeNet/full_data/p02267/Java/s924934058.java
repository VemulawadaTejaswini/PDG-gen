import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]){
	int i,j,k,n,q,count=0;
	int s[] = new int[1000000];
	int t[] = new int[1000000];
	Scanner scan = new Scanner(System.in);
	
	n = scan.nextInt();
	for(i=0;i<n;i++){
	    s[i] = scan.nextInt();
	}
	q = scan.nextInt();
	for(j=0;j<q;j++){
	    t[j] = scan.nextInt();
	}
	
	for(i=0;i<n;i++){
	    for(k=1;k<n;k++){
		if(s[i]==s[k]){continue;}
	    }
		for(j=0;j<q;j++){
		    if(s[i]==t[j]){
			count++;
		    }
		}
	    }
	System.out.println(count);
    }
}

