import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}
}