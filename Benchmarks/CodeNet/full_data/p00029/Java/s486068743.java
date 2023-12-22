import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main{ 
    
    public static void main(String[] args)throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	String[] str = new String[40];
	String line=br.readLine();
	StringTokenizer st=new StringTokenizer(line);
	int i=0;
	int n = st.countTokens();
	while(st.hasMoreTokens()){
	    str[i]=st.nextToken();
	    i++;
	}
	int key=0,cntmax=0;
	for(i =0;i<n-1;i++){
	    int cnt=0,result=0;
	    for(int j=i+1;j<n;j++){
		if(str[i].equals(str[j])){
		    cnt++;
		    if(cnt>cntmax){
			cntmax=cnt;
			key=i;
		    }		    
		}
	    }
	}
	int l=0;
	for(i=0;i<n;i++)
	    if(str[l].length()<str[i].length())
		l=i;
	System.out.println(str[key]+" "+str[l]);
    }
}
	