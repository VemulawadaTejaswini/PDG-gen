import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	private static       boolean flg     = false;
	private static       int     index   = 0;
	private static final boolean SUCCESS = true;
	private static final int     EMPTY   = -1,
			                     END     = 10;

	private static int[]               pipe_A = new int[10];
	private static ArrayDeque<Integer> pipe_B = new ArrayDeque<Integer>(),
                                       pipe_C = new ArrayDeque<Integer>();

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
    	int n = sc.nextInt();

    	String[] s;
    	for(int i=0;i<n;i++){
    		s = sc.next().split("\\s");
    		for(int j=0;j<10;j++){pipe_A[j] = Integer.parseInt(s[j]);}
    		init();
    		push('B');
			if   (flg){System.out.println("YES");}
			else      {System.out.println("NO"); }
    	}
    }

    private static void init(){
		pipe_B.clear();
		pipe_C.clear();
		pipe_B.add(EMPTY);
		pipe_C.add(EMPTY);
		flg = false;
		index = 0;
    }

    private static void push(char pipe){

    	if(flg){return;}
    	if(index == END){
    		flg = SUCCESS;
    		return;
   		}
    	int ball = pipe_A[index];
    	ArrayDeque<Integer> pipe_X = null;
    	if      (pipe == 'B'){pipe_X = pipe_B;}
    	else if (pipe == 'C'){pipe_X = pipe_C;}

		if(pipe_X.peek() < ball ){
			pipe_X.push(ball);
	    	index++;
		} else if(pipe_X == pipe_C){
			if(index == 0){return;}
			if     (pipe_A[index - 1] == pipe_B.peek()){pipe_B.pop();}
			else if(pipe_A[index - 1] == pipe_C.peek()){pipe_C.pop();}
			index--;
			return;
		} else {
			return;
		}
		push('B');
		push('C');
    }
}