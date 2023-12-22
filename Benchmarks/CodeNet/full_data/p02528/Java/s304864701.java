import java.util.*;
import java.io.*;
class main{
public static void main(String[] args)throws IOException{	  
BufferedReader br =new BufferedReader(new 
	  InputStreamReader(System.in));
	  int n=Integer.parseInt(br.readLine());
	  String[] who=new String[n];
	  who=br.readLine().split(" ");
	  int num[]=new int[n];
	  for(int i=0;i<n;i++){
	  	num[i]=Integer.parseInt(who[i]);
	  }
	  Arrays.sort(num);
	  for(int i=0;i<n;i++){
	  	System.out.println(num[i]);
	  }
 }
}