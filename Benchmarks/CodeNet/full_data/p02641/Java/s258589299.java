import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
public static void main (String[] args) {
Scanner scn= new Scanner(System.in);
		
            int x=scn.nextInt();
            int n=scn.nextInt();
            HashMap<Integer,Integer> map=new HashMap<> ();
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
		    int a[]= new int[n];
		    for(int i=0; i<n; i++){
                a[i]=scn.nextInt();
                map.put(a[i],1);
                min=Math.min(min,a[i]);
                max=Math.max(max,a[i]);
            }
            if(n==0){
                System.out.println(x);
            } else 
		    System.out.println(some(a,x,n,map,min,max));
		
	}
	public static int some(int a[],int x, int n,HashMap<Integer,Integer> map, int min, int max){
        // if(x<=min) return min-1;
        // if(x>=max) return max+1; 
        if(x<min){
            if((x-1)<=min){
                return x-1;
            } else {
                return x+1;
            } 
        }
        if(x>max){
            if((x-1)>max){
                return x-1;
            } else {
                return x+1;
            }
        }
        ArrayList<Integer> al=new ArrayList<> ();
        for(int i=min; i<=max; i++){
            if(!map.containsKey(i)){
                al.add(i);
            }
        }
        if(al.size()==0){
            if(Math.abs((min-1)-x)>Math.abs((max+1)-x)){
                return max+1;
            } else {
                return min-1;
            }
        }
        int mans=Integer.MAX_VALUE;
        int ans=0;
        Collections.sort(al);
        while(al.size()!=0){
            int p=al.get(0);
            int temp=Math.abs(x-p);
            if(temp<mans){
                mans=temp;
                ans=p;
            }     
            al.remove(0);
        }
        return ans;
	}
}
