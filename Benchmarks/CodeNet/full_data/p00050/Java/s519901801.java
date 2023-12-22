//Volume0-0050
import java.util.Scanner;

public class Main {

	private static final String APPLE = "apple",
			                    PEACH = "peach";
	private static       int    index = 0;
	private static       char[] in_line,
	                            out_line;

	public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);
    	in_line  = sc.nextLine().toCharArray();

    	//calculation
    	out_line = new char[in_line.length];
    	for(index=0;index<in_line.length;index++){
    		if(!check()){out_line[index] = in_line[index];}
    	}

    	//output
    	System.out.println(String.valueOf(out_line));
	}

	private static boolean check(){
		boolean ret = false;
        String fruit_chk     = "N",
               fruit_replace = "N";
        char   p = 'N';

		for(int j=0;j<2;j++){
			if(j == 0){p = 'a'; fruit_chk = APPLE; fruit_replace = PEACH;}
			if(j == 1){p = 'p'; fruit_chk = PEACH; fruit_replace = APPLE;}
			if(in_line[index] == p){
				if(chk(fruit_chk)){
					replace(fruit_replace);
					ret = true;
					break;
				}
			}
		}
		return ret;
	}

	private static boolean chk(String fruit){
		boolean ret = false;
		if(index + 4 < in_line.length){
			if(String.valueOf(in_line,index,5).equals(fruit)){
				ret = true;
			}
		}
		return ret;
	}

	private static void replace(String fruit){

		char[] f = fruit.toCharArray();
		for(int i=0;i<f.length;i++){
			out_line[index] = f[i];
			if(i<f.length-1){index++;};
		}
	}
}