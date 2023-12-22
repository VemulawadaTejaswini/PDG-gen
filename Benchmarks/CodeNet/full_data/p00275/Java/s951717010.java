import java.io.*;
import java.math.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		//BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		Scanner r= new Scanner(System.in);
		char[] c;
		String s;
		int[] huda=new int[10];
		int n;
		int turn;
		int field;
		int i,j;

		while(r.hasNext()){
			turn = 0;
			field= 0;
			s = r.nextLine();
			n = Integer.parseInt(s);
			if(n == 0) break;
			for(i=0;i<n;i++) huda[i]=0;
			s = r.nextLine();
			c = s.toCharArray();
			for(i=0;i<100;i++){
				switch(c[i]){
					case 'M':
						huda[turn]++;
						break;
					case 'S':
						field += huda[turn] + 1;
						huda[turn] = 0;
					 	break;
					case 'L':
						huda[turn] += field + 1;
						field = 0;
						break;
				}
				if(turn+1 == n)
					turn = 0;
				else turn++;
			}
			Arrays.sort(huda,0,n-1);
			for(i=0;i<n;i++) System.out.print(huda[i]+" ");
			System.out.println(field);
		}
	}
}