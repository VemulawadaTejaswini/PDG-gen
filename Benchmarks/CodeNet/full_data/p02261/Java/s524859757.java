import java.util.*;

public class Main {
    String[] bubbleSort(String[] s){
		int n=s.length;
		int[] lst=new int[n];
		for(int i=0;i<n;i++){
		    char[] c = s[i].toCharArray();
		    lst[i]=Character.getNumericValue(c[1]);}
		for(int i=0;i<n-1;i++){
			for(int j=n-1;j>i;j--){
				if(lst[j]<lst[j-1]){
					int x=lst[j];
					lst[j]=lst[j-1];lst[j-1]=x;
					String y=s[j];
					s[j]=s[j-1];s[j-1]=y;
				}
			}
		}
		return s;
	}
	
	String[] selectionSort(String[] s){
		int n=s.length;
		int[] lst=new int[n];
		for(int i=0;i<n;i++){
		    char[] c = s[i].toCharArray();
		    lst[i]=Character.getNumericValue(c[1]);}
		for(int i=0;i<n-1;i++){
			int min=Integer.MAX_VALUE;
			for(int j=i;j<n;j++){min=Math.min(min, lst[j]);}
			if(min==lst[i])continue;
			for(int j=i+1;j<n;j++){
				if(min==lst[j]){
					int x=lst[i];
					lst[i]=lst[j];lst[j]=x;
					String y=s[i];
					s[i]=s[j];s[j]=y;
					break;
				}
			}
		}
		return s;
	}
    public static void main(String[] args) throws Exception {
        Main m=new Main();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();String s;
        String[] lst=new String[n];
        String[] lst1=new String[n];
        for(int i=0;i<n;i++){s=sc.next();lst[i]=s;lst1[i]=s;}
        m.listPrint(m.bubbleSort(lst));
        System.out.println("Stable");
        m.listPrint(m.selectionSort(lst1));
        m.print(lst,lst1);
    }
    void listPrint(String[]x){
		for(int i=0;i<x.length;i++){
	        if(i==0){System.out.printf("%s",x[i]);continue;}
	        System.out.printf(" %s",x[i]);
		}
		System.out.println();
	}
	void print(String[] a,String[] b){
	    for(int i=0;i<a.length;i++){
	        if(a[i]!=b[i]){System.out.println("Not stable");return;}
	    }
	    System.out.println("Stable");
	}
}
