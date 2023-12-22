import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String str=input.readLine();
		int n=Integer.parseInt(str);
		int b=0;
		int f=0;
		int r=0;
		int v=0;
		int bangou=0;
		int[] manshion=new int[300];
		for(int i=0;i<300;i++){
			if((i>=60&&i<=79)||(i>=140&&i<=159)||(i>=220&&i<=239)){	
				manshion[i]=99;//#
			}else if(i%2==0){
				manshion[i]=999;//??????
			}else{
				manshion[i]=0;
			}	
		}
		
		for(int i=0;i<n;i++){
			String str2=input.readLine();
			String[] arr =str2.split(" ");
			 b=Integer.parseInt(arr[0]);
			 f=Integer.parseInt(arr[1]);
			 r=Integer.parseInt(arr[2]);
			 v=Integer.parseInt(arr[3]);
			bangou=((b-1)*4+f)*20-(20-r*2);
			manshion[bangou-1]+=v;

		}
		for(int i=0;i<manshion.length;i++){
			if(manshion[i]==999){
				sb.append(" ");
			}else if(manshion[i]==99){
				sb.append("#");
			}else{
				sb.append(manshion[i]);
			}
			if((i+1)%20==0){
				sb.append("\n");
			}
		}
		
		System.out.print(sb);
	}
}