import java.util.Scanner;

public class copy{
    public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	String str = "";
	
	while(true){
	    str = scan.next();
	    if(str.equals("#END")){
		break;
	    }else{
		System.out.println(rs(str));
	    }	    
	}
    }


    public static String rs(String str){
	char[] chr = str.toCharArray();
	int cl = chr.length;
	int[][] RS = new int[cl][cl];
	int maxl = 0;
	int memol = 0;
	String memoRS = "";
	String maxRS = "";

	for(int i = 0; i < cl; i++){RS[i][0] = 0;}
	for(int i = 0; i < cl; i++){RS[0][i] = 0;}

	for(int split = 1; split < cl; split++){
	    memoRS = "";
	    memol = 0;
	    for(int i = 1; i <= split; i++){
		for(int j = 1; j <= cl - split; j++){
		    if(chr[i-1] == chr[j-1+split]){
			RS[i][j] = RS[i-1][j-1] + 1;
		    }else if(RS[i-1][j] >= RS[i][j-1]){
			RS[i][j] = RS[i-1][j];
		    }else{
			RS[i][j] = RS[i][j-1];
		    }
		
		    if(memol < RS[i][j]){
			memol = RS[i][j];
			memoRS = memoRS + chr[i-1];
		    }
		}
	    }
	    if(memol > maxl){
		maxl = memol;
		maxRS = memoRS;
	    }	    
	}
	return maxRS;
    }
}