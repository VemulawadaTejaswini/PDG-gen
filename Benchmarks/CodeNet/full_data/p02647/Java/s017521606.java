import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n=sc.nextInt();	
      	int k=sc.nextInt();	
      	int a[]=new int [n];
      	int b[]=new int[n];
      	boolean flag = true;
      	for(int i=0;i<n;i++){a[i]=sc.nextInt();b[i]=0;}
      	aaa:for(int i=0;i<k;i++){
          	flag=false;
        	for(int j=0;j<n;j++){
            	for(int x=Math.max(j-a[j],0);x<=Math.min(j+a[j],n-1);x++){
                b[x]++;
                		}
            	}
      	for(int y=0;y<n;y++){a[y]=b[y];b[y]=0;if(a[y]!=n){flag=true;}}
          	if(flag==false){break aaa;}
        }
      String ans = "";
      for(int i=0;i<n;i++){ans=ans+a[i]+" ";}
      System.out.println(""+ans);
}
}