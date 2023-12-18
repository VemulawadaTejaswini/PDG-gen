/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int row=Integer.parseInt(s[0]);
		int column=Integer.parseInt(s[1]);
		int k=Integer.parseInt(s[2]);
		String[][] cake=new String[row][];
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<row;i++){
			cake[i]=br.readLine().split("");
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(cake[i][j].equals("#"))
					hs.add(i);
			}
		}
		int[][] answer=new int[row][column];
		int count=0;
		for(int i=0;i<column;i++){
			int strawberry=0;
			if(hs.contains(i))
				count++;
			if(i%2==0){
			for(int j=0;j<column;j++){
				if(cake[i][j].equals("#") && strawberry<1)
					strawberry++;
				else{
					if(cake[i][j].equals("#")){
					count++;
					strawberry=0;
					}
				}
				answer[i][j]=count;
			}
			}else{
				for(int j=column-1;j>=0;j--){
				if(cake[i][j].equals("#") && strawberry<1)
					strawberry++;
				else{
					if(cake[i][j].equals("#")){
					count++;
					strawberry=0;
					}
				}
				answer[i][j]=count;
			}
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(answer[i][j]+" ");
			}
			System.out.println();
		}
	}
}