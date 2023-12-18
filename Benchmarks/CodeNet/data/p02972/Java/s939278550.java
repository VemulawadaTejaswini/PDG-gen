import java.util.*;
public class Main {
 public static void main(String args[]) {
	 Scanner sc =new Scanner(System.in);
	 int N = sc.nextInt();
	 int data[]=new int[N+1];
	 int ans[] =new int[N+1];
	 int max =0;
	 int max1=0;
	 int aa=0;
	 ArrayList<Integer> ar =new ArrayList<Integer>();
	 ArrayList<Integer> arans =new ArrayList<Integer>();
	 boolean flag=false;
	 for(int i=1;i<N+1;i++) {
		 data[i]=sc.nextInt();
		 aa +=data[i];
	 }
	 
	 for(int t=1;t<N+1;t++) {
		 if(aa==0||flag==true) break;
		 
	 for(int i=1;i<N+1; i++) {
		 
		 if(i%t==0) {
			 ans[t] += data[i];
			 if(data[i]>0) {
			 ar.add(i);
			 }
		 }
		
		 if(i==N) {
			 if(ans[t]%2==t) {
				 flag=true;
				 max =ans[t];
				 arans.clear();
				 for(int j=0;j<ar.size();j++) {
					 int tt= ar.get(j);
					 arans.add(tt);
					 
				 }
				
				 
			 }
			 ar.clear(); 
		 }
		 
		
	 }
	 }
	 
	 if(aa == 0) {
		 System.out.println( "0");
     }else if(flag==false) {
		 System.out.println("-1");
	 }else {
	 System.out.println(max);
	 for(int i=0;i<arans.size();i++) {
		System.out.println(arans.get(i));
	 }
	 
	 }
		 

	 
 }
}
