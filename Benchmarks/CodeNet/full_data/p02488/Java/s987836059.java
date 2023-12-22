import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try{
			String line=reader.readLine();
			int n=Integer.parseInt(line);
			String[] str=new String[n];
			for(int i=0;i<n;i++)str[i]=reader.readLine();
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(str[i].compareTo(str[j])>=0){
						String k=str[i];
						str[i]=str[j];
						str[j]=k;
					}
				}
			}
			System.out.println(str[0]);
		}catch(IOException e){
			System.out.println(e);
		}
	}
}