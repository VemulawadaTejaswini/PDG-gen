import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] ar, ss;
	int j, k, x, put=0, alo=0;
	while(sc.hasNext()){
	x = sc.nextInt();
	ar = new int[x];
	ss = new int[x];

	for(j=1; j<x; j++)
	    if(ar[j]==0){
		ss[put]=j+1;
		put++;
		for(k=j+1; k<x+1; k+=(j+1))
		    ar[k-1]=1;
	    }
	for(int pak=0; pak<x; pak++)
	    ar[pak]=0;
	for(int le=0; ss[le]!=0; le++)
	    ar[ss[le]-1] = 1;
	for(int pak=0; pak<x; pak++)
	    if(ar[pak]==1 && ar[x-pak-1]==1)
	   	alo++;
	System.out.println(alo);
    }
    }}