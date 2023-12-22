import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			int n=Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++){
				String[] str=br.readLine().split(" ");
				int[] data=new int[3];
				for(int j=0;j<3;j++){
					data[j]=Integer.parseInt(str[j]);
				}
				Arrays.sort(data);
				if(data[0]*data[0]+data[1]*data[1]==data[2]*data[2]){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
		}catch(Exception e){
		}
	}
}