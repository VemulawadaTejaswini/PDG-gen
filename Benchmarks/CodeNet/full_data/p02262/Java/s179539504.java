import java.io.*;
import java.util.*;

public class Main{

    static int cnt;
    static int m;
    static List<Integer> G=new ArrayList<>();
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());
	int a[]=new int[n];

	for(int i=0;i<n;i++){
	    a[i]=Integer.parseInt(br.readLine());
	}

	shellSort(a,n);

	System.out.println(m);

	for(int i=G.size()-1;i>=0;i--){
	    if(i==0)
		System.out.print(G.get(i));
	    else
		System.out.print(G.get(i)+" ");
	}

	System.out.println("\n"+cnt);
	
	for(int i=0;i<n;i++){
	    System.out.println(a[i]);
	}
    }
    
    static void shellSort(int a[],int n){
	cnt=0;
	
	for(int i=1;i<=n;i=3*i+1){
	    G.add(i);
	    m++;
	}
	
	for(int i=m-1;i>=0;i--){
	    insertionSort(a,n, G.get(i));
	}
    }
    
    static void insertionSort(int a[],int n,int g){
	for(int i=g;i<n;i++){
	    int v=a[i];
	    int j=i-g;
	    while(j>=0&&a[j]>v){
		a[j+g]=a[j];
		j=j-g;
		cnt++;
	    }
	    a[j+g]=v;
	}
    }
}

