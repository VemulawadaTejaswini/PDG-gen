import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

class Main
{
    public static char [][] transpose(char [][] p)  // p: m(rows) x n(columns)
    {
	int m = p.length;
	int n = p[0].length;
	char [][] q = new char [8][5];
	
	for (int i=0; i<5; i++){
	    for (int j=0; j<8; j++){
		q[j][i]=p[i][j];
	    }
	}

	return q;
    }

    public static char [][] conv(int n)
    {
	char [][] a = {    // char[9][8] a; 
	    {'*',' ','=',' ','*','*','*','*'}, 
	    {'*',' ','=','*',' ','*','*','*'}, 
	    {'*',' ','=','*','*',' ','*','*'}, 
	    {'*',' ','=','*','*','*',' ','*'}, 
	    {'*',' ','=','*','*','*','*',' '}, 
	    {' ','*','=',' ','*','*','*','*'}, 
	    {' ','*','=','*',' ','*','*','*'}, 
	    {' ','*','=','*','*',' ','*','*'}, 
	    {' ','*','=','*','*','*',' ','*'}, 
	    {' ','*','=','*','*','*','*',' '} };
	int[] p = new int[5];
	String s = String.format("%05d", n);
	for (int i=0; i<5; i++){
	    p[i]=Integer.parseInt(s.substring(i,i+1));
	}
	char [][] m = new char [5][8];
	for (int i=0; i<5; i++){
	    for (int j=0; j<8; j++){
		m[i][j] = a[p[i]][j];
	    }
	}
	
	return transpose(m);
    }

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	/*
	  if true then
	  fh=STDIN
	  else
	  fh=open("in1_0128.txt")
	  end
	*/
	String line=null;
        boolean first = true;
	List<String> glyph = new ArrayList<String>();
	while ((line=br.readLine()) != null) {
	    int n=Integer.parseInt(line);
	    char [][] q = conv(n);
	    if (!first)
		System.out.println("");
	    for (int i=0; i<8; i++){
		System.out.println(q[i]);
	    }
	    first = false;
	}

	for  (int i=0; i<glyph.size()-1; i++){
	    System.out.println(glyph.get(i));
	    if (i != glyph.size()-1)
		System.out.println();
	}
    }

}