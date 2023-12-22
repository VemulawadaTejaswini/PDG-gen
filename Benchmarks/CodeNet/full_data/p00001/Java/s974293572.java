import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int i,j,t;
		int[] c = new int[10];
		try {
			for(i=0;i<10;i++){
				s = r.readLine();
				c[i] = Integer.parseInt(s);
			}
			for(i=0;i<9;i++){
				for(j=0;j<9-i;j++){
					if (c[j]<c[j+1]){
							t=c[j];c[j]=c[j+1];c[j+1]=t;
					}
				}
			}
			for(i=0;i<3;i++)System.out.println(c[i]);
		} catch (NoSuchElementException e) {
			System.exit(0);
		}
	}
}