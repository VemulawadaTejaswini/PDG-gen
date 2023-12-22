import java.io.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader br=
	    new BufferedReader(new InputStreamReader(System.in));
	while(true){
	    int n,m;
	    String[] buf=br.readLine().split(" ");
	    n=Integer.parseInt(buf[0]);
	    m=Integer.parseInt(buf[1]);
	    if(n==0 && m==0)break;
	    boolean[][] check =new boolean[n][m];
	    char[][] data=new char[n][m];
	    for(int i=0;i<n;i++){
		    String s=br.readLine();
		    data[i]=s.toCharArray();
		    System.out.println(i);
	    }
	    int i=0,j=0;
	    while(true){
		if(check[i][j]){
		    System.out.println("LOOP");
		    break;
		}else if(data[i][j]=='.'){
		    System.out.printf("%d %d\n",j,i);
		    break;
		}
		int t_i=i,t_j=j;
		check[i][j]=true;
		i=next_v(data[t_i][t_j],t_i);
		j=next_h(data[t_i][t_j],t_j);
	    }
	}
    }
    public static int next_v(char data,int i){
	if(data=='v')
	    return i+1;
	if(data=='^')
	    return i-1;
	return i;
    }
    public static int next_h(char data,int j){
	if(data=='>')
	    return j+1;
	if(data=='<')
	    return j-1;
	return j;
    }
}