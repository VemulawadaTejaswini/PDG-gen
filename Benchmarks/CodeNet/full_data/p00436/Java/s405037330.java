package atrace;

import java.util.Scanner;

public class Main {
	 static int n[],N[],M;
	 static boolean b;
	
	public static void ri(){
		if(!b){for(int i=0;i<n.length;i++){
			if(i<(n.length/2)){N[i*2]=n[i];}
			else{N[(i-n.length/2)*2+1]=n[i];}
		}b=true;}
		else{{for(int i=0;i<N.length;i++){
			if(i<(N.length/2)){n[i*2]=N[i];}
			else{n[(i-N.length/2)*2+1]=N[i];}
		}}b=false;}
        		
	} 
	
	public static void ka(){
		if(!b){for(int i=0;i<n.length;i++){
			if(i<M){N[i+n.length-M]=n[i];}
			else{N[i-M]=n[i];}
			
		}b=true;
	}
		
		else{for(int i=0;i<N.length;i++){
			if(i<M){n[i+N.length-M]=N[i];}
			else{n[i-M]=N[i];}
			
		}b=false;
	}}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		n=new int[sc.nextInt()*2];
		for(int i=0;i<n.length;i++){n[i]=i+1;}
		int m=sc.nextInt();
		N=new int[n.length];
		for(int i=0;i<m;i++){
              M=sc.nextInt();	
              if(M==0){ri();}
              else{ka();}
		}
		if(!b){for(int i=0;i<n.length;i++){
		System.out.println(n[i]);}}
		
		else{for(int i=0;i<n.length;i++){
			System.out.println(N[i]);}}
        
	}

}