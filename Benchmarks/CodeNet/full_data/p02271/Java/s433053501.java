import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	int i,j,n,q;
	Scanner sc = new Scanner(System.in);
	int a[] = new int[20];
	int m[] = new int[200];
	int s[] = new int[2000];
	n = sc.nextInt();
	for(i=0;i<n;i++){
	    a[i] = sc.nextInt();
	}
	q = sc.nextInt();
	for(j=0;j<q;j++){
	    m[j] = sc.nextInt();
	}
	for(j=0;j<q;j++){
	    if(solve(0,m[j],n,a)==true){
		System.out.println("yes");
	    }
	    else{
		System.out.println("no");
	    }
	}
    }
    public static boolean solve(int i,int m,int n,int a[]){
	boolean success;
	if(m==0){
	    return true;
	}
	if(i>=n){
	    return false;
	}
	success = solve(i+1,m,n,a) || solve(i+1,m-a[i],n,a);
	return success;
    }
}

