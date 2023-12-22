import java.io.*;

 public class Main{
	 public static void main(String args[]) throws IOException{
		 BufferedReader bf = new BufferedReader(
				 new InputStreamReader(System.in));
		 int deta[] = new int[1000];
		 int x,j = 0;
		 String str;
		 while((str = bf.readLine()) != null ){
			 x = Integer.parseInt(str);
			 for(int i = 0; i < (600/x) -1; i++){
				 deta[j] += x*(sqrt((1+i)*x));
			 }
			 j++;		
		 }
		 for(int i = 0; i < j ;i++){
			 System.out.println(deta[i]);
		 }
		 
	 }
	 
	 public static int sqrt(int x){
		 int y;
		 y = x*x;
		 return y;
	 }
}