
//import java.lang.Math;
import java.util.*;
//import java.util.ListIterator;
//import java.util.Iterator;
//import java.util.LinkedList;

class Main{

	public static void main(String[] arg) {

		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] demo= new int[n];
		for(int i=0;i<n;i++){
			demo[i]=sc.nextInt();
			
		}
		int m=sc.nextInt();
		int[] demo2= new int[m];
		for(int i=0;i<m;i++){
			demo2[i]=sc.nextInt();
			
		}
		
		int c=Math.min(n, m);
		int key=0;
		for(int i=0;i<c;i++){
			//if(demo[i]==demo2[i])continue;
			if(demo[i]!=demo2[i]){
				
			if(demo[i]<demo2[i]){ 
				key=1;
			}	
			else if(demo[i]>demo2[i]){ 
				key=-1;
				
				}
			break;}		 
		}  
		if(key==1||(key==0&&n<m)){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
			}		}
