import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String N_moji = br.readLine();
	int N = Integer.parseInt(N_moji);
	long N_kaijou = 1;
	long count = 0;
	long i,x,y;
	long amari;

	for(i = 1; i <= N; i++){
	    N_kaijou *= i;
	}
	
	for(i = 1; i <= N_kaijou; i++){
	    x = i;
	    y = N_kaijou / x;
	    if(x >= y){
		break;
	    }
	    if(x == y){
		count++;
		break;
	    }
	    if((N_kaijou % x) == 0){
		count += 2;
	    }   
	}
	amari = count % ((int)Math.pow(10,9) + 7);
	System.out.println(amari);
    }
}
	    
	   
	
