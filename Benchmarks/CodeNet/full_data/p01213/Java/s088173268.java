import java.util.Scanner;

public class Main{
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
	int[][] c = new int[chr.length][chr.length];
	String[][] RS = new String[chr.length][chr.length];
	int split = 1;
	int maxl = 0;
	String maxRS = "";

	for(int i = 0; i < chr.length; i++){RS[i][0] = "";}
	for(int i = 0; i < chr.length; i++){RS[0][i] = "";}
	    
	for(int i = 0; i < chr.length; i++){c[i][0] = 0;}
	for(int i = 0; i < chr.length; i++){c[0][i] = 0;}

	for(int k = 1; k < chr.length; k++){
	    for(int i = 1; i <= split; i++){
		for(int j = 1; j <= chr.length - split; j++){
		    if(chr[i-1] == chr[split+j-1]){
			RS[i][j] = RS[i-1][j-1] + chr[i-1];
			c[i][j] = c[i-1][j-1]+1;
		    }else if(c[i-1][j] >= c[i][j-1]){
			RS[i][j] = RS[i-1][j];
			c[i][j] = c[i-1][j];
		    }else{
			RS[i][j] = RS[i][j-1];
			c[i][j] = c[i][j-1];
		    }
		    if(maxl < c[i][j]){
			maxl = c[i][j];
			maxRS = RS[i][j];
		    }
		}
	    }
	    split++;
	}
	return maxRS;
    }
}