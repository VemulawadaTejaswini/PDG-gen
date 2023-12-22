import java.util.Scanner;

public class Main {

    private static char[]   cells = new char[9];
    private static int [][] cond = {{0,1,2},{3,4,5},{6,7,8},
    	                            {0,3,6},{1,4,7},{2,5,8},
    	                            {0,4,8},{2,4,6}        };

	public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);

        char ret;
        while(sc.hasNext()){
        	cells = sc.next().toCharArray();
        	ret = check();
        	System.out.println(ret);
        }
	}

	private static char check(){

		char t   = 'n',
		     ret = 'n';

		loop:for(int i=0;i<2;i++){

			ret = 'd';

			if      (i == 0){ t = 'o';}
			else if (i == 1){ t = 'x';}

			for(int j=0;j<8;j++){
				if ( cells[cond[j][0]] == t &&
					 cells[cond[j][1]] == t &&
					 cells[cond[j][2]] == t    ){
					ret = t;
					break loop;
				}
			}
		}
		return ret;
	}
}