

import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        int check=0;
        int  N=sc.nextInt();
        int K=sc.nextInt();
        int min=9999999;
        int minnum=0;
       // int minnum;
        int[] S=new int[N];
        for(int i=0;i<N;i++) {
        		S[i]=sc.nextInt();
        		if(S[i]<min) {min=S[i];minnum=i;}
        }
        if(minnum<K||(N-minnum)<K) {
        while(true) {
        	if(N<=0) {break;}
        	N-=K;
        	if(check>0) {N+=1;}
        	check++;
        }
	}
        else {
        	int tmpp=minnum;
        	int tmpm=minnum;
        	while(true) {
        		if(tmpp<N) {tmpp+=K-1;check++;}
        		if(tmpm>0) {tmpm+=-K+1;check++;}
        		if(tmpp>=K&&tmpm<=0) {break;}

        	}
        }
System.out.println(check);
	}

}
