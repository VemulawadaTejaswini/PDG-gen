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
	int cl = chr.length;
	String[][] RS = new String[2][cl];
	int split = 1;
	int maxl = 0;
	String maxRS = "";
	
	for(int i = 0; i < 2; i++){RS[2][0] = "";}
	while(split < cl-1){
	    for(int i = 0; i < cl; i++){RS[0][i] = "";}
	    for(int i = 1; i <= split; i++){
		for(int j = 1; j <= cl - split; j++){
		    if(chr[i-1] == chr[j-1+split]){
			RS[1][j] = RS[0][j-1] + chr[i-1];
		    }else if(RS[0][j].length() >= RS[1][j-1].length()){
			RS[1][j] = RS[0][j];
		    }else{
			RS[1][j] = RS[1][j-1];
		    }
		    if(maxl < RS[1][j].length()){
			maxl = RS[1][j].length();
			maxRS = RS[1][j];
		    }
		}
		for(int k = 0; k < cl-1 ;k++){
		    RS[0][k] = RS[1][k];
		    System.out.println(RS[1][k]);
		}
	    }
	    split++;
	}
	return maxRS;
    }
}