import java.util.*;
import java.io.*;
public class Main {
	static final int NONUM=-1;
	
	public static void main(String[] args)throws IOException{
		final Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		NODE[] n = new NODE[a];
		
		for(int i=0;i<n.length;i++){
			int id=sc.nextInt();
			n[id]=new NODE();
			n[id].id=id;
			n[id].k=sc.nextInt();
			n[id].p=NONUM;
			n[id].t="leaf";
			if(n[id].k>0){
				n[id].c=new int[n[id].k];
				for(int j=0;j<n[id].k;j++){
					n[id].c[j]=sc.nextInt();
				}
				n[id].t="Internal Node";
			}
		}
		
	     for(int i=0; i<a; i++){
	    	 for(int k=0; k<n[i].k; k++){
	    		 n[n[i].c[k]].p = n[i].id;
	         }
	     }
		
		for(int i=0;i<a;i++){
			if(n[i].p==NONUM){
				n[i].t="root";
				for(int j=0;j<n[i].k;j++){
				getdepth(n,n[i].c[j],1);
				}
			}
		}
		
		for(int i=0;i<a;i++){
			System.out.print("node "+n[i].id+": parent = "+n[i].p+ ", depth = "+n[i].d+", "+n[i].t+"[");
			for(int j=0;j<n[i].k;j++){
				if(j==0) System.out.print(n[i].c[j]);
				else System.out.print(", "+n[i].c[j]);
			}
			System.out.println("]");
		}
	}
	
	static void getdepth(NODE[] n,int i,int d){

		n[i].d=d;
		d++;
		for(int j=0;j<n[i].k;j++){
			getdepth(n,n[i].c[j],d);
		}
	}		
}

class NODE{
	int id;
	int k;
	int[] c;
	int p;
	int d;
	String t; 
}