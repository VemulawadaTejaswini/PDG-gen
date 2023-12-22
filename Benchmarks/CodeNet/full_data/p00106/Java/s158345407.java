import java.io.*;
import static java.lang.Math.max;
public class Main {
    public static void main(String[] args)throws IOException{
	int[][] bag =
	    {{200,380,5,20},
	     {300,550,4,15},
	     {500,850,3,12}};
	try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in))){
	String buf;
	while((buf = br.readLine())!=null){
	    int max = 0;
	    int g = Integer.parseInt(buf);
	    if(g == 0)break;
	    for(int i =0; i <bag.length;i++){
		if((g%=bag[i][0]) == 0)
		    g/=bag[i][0];
		else{
		    g/=bag[i][0];g++;
		}
		int pay;
		pay = (bag[i][1])*(100 - bag[i][3]);
		pay *= g/bag[i][2];
		pay += bag[i][1]*(g%bag[i][2]);
		max = max(max,pay);
	    }
	    System.out.println(Integer.toString(max));
	}
	    }
    }
}