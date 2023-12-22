import java.io.*;
public class Main {
   public static void main(String[] args) throws IOException{
	   BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	   String s;
	   String tmp = "";
	   String sizetmp = "";
	   int cmax = -1;
	   int max = -1;
	   int cnt;
	   s = buf.readLine();
	   String[] data = s.split(" ");
	   for(int i=0;i<data.length;i++){
		   cnt = 1;
		   if(cmax < data[i].length()-1){
			   cmax = data[i].length()-1;
			   sizetmp = data[i];
		   }
		   for(int j=0;j<data.length;j++){
			   if(data[i].equals(data[j]) && i != j) cnt++;
		   }
		   if(max < cnt){
			   tmp = data[i];
			   max = cnt;
		   }
	   }
	   System.out.println(tmp + " " + sizetmp);
   }
}