import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        // TODO ?????????????????????????????????????????????
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int input = 0;
        for(int i = 0; i < 3; i++){
            String[] tmpStr = br.readLine().split(" ");
            for(int j = 0; j < 3; j++){
                int number = Integer.parseInt(tmpStr[j]);
                //?????????????????\???????????§0???9???????????????
                if(number == 0){
                    number = 9;
                }
                input += number * Math.pow(10, 8 - (i*3 + j));
            }
        }
        //???????????????????????????
        //System.out.println(swapTiles(123496758, DOWN));
        /*
        boolean[] tmpResult = checkAvailable(921436795);
        if(tmpResult[UP]){
        	System.out.println("UP OK");
        }
        if(tmpResult[RIGHT]){
        	System.out.println("RIGHT OK");
        }
        if(tmpResult[DOWN]){
        	System.out.println("DOWN OK");
        }
        if(tmpResult[LEFT]){
        	System.out.println("LEFT OK");
        }
        */
        
        //System.out.println(input);
        
        searchPath(input, 0, START);
        //System.out.println("END");
        System.out.println(minimumTurn.get(123456789));
    }
     
    static int call = 0;
    static void recursiveTest(int depth){
        char[][] test = new char[3][3];
         
        call++;
        System.out.println("depth is "+depth+" call "+call);
        if(depth == 32){
            return;
        }
        recursiveTest(depth + 1);
        recursiveTest(depth + 1);
        recursiveTest(depth + 1);
        recursiveTest(depth + 1);
    }
    
    static HashMap<Integer, Integer> minimumTurn = new HashMap<Integer, Integer>();
    static final int finish = 123456789;
    static int currentMin = Integer.MAX_VALUE;
    
    static int searchPath(int condition, int depth, int direction){
    	//?????§??????????????£?????????????????±??????????????????
    	if(depth >= currentMin || depth >= 32){
    		return 0;
    	}
    	//??????????\?
    	if(direction != START){
    		condition = swapTiles(condition, direction);
    	}
    	//System.out.println(condition+" depth = "+depth + " hash size "+ minimumTurn.size());
    	if(!minimumTurn.containsKey(condition) || minimumTurn.get(condition) > depth){
    		minimumTurn.put(condition, depth);
    	}
    	
    	//????§?????????????????????§??????
    	else if(minimumTurn.get(condition) <= depth){
    		return 0;
    	}
    	
    	//??¢?´¢?????????????????§??????
    	if(condition == finish){
    		///System.exit(0);
    		currentMin = depth;
    		return 1;
    	}
    	boolean[] available = checkAvailable(condition);
    	int result = 0;
    	//???
    	if(direction != DOWN && available[UP]){
    		searchPath(condition, depth + 1, UP);
    	}
    	//???
    	if(direction != LEFT && available[RIGHT]){
    		searchPath(condition, depth + 1, RIGHT);
    	}
    	//???
    	if(direction != UP && available[DOWN]){
    		searchPath(condition, depth + 1, DOWN);
    	}
    	//???
    	if(direction != RIGHT && available[LEFT]){
    		searchPath(condition, depth + 1, LEFT);
    	}
    	return 0;
    }
    
    private static int swapTiles (int condition, int direction){
    	char[] condChar = Integer.toString(condition).toCharArray();
    	
    	int index9 = Integer.toString(condition).indexOf('9');
    	int targetIndex;
    	if(direction == UP){
    		targetIndex = index9 - 3;
    	}
    	else if(direction == RIGHT){
    		targetIndex = index9 + 1;
    	}
    	else if(direction == DOWN){
    		targetIndex = index9 + 3;
    	}
    	else{
    		targetIndex = index9 - 1;
    	}
    	
    	char tmp = condChar[index9];
    	condChar[index9] = condChar[targetIndex];
    	condChar[targetIndex] = tmp;
    			
    	
    	return Integer.parseInt(new String(condChar));
    }
    
    static final int UP = 0;
    static final int RIGHT = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;
    static final int START = 4;
    
    private static boolean[] checkAvailable(int condition){
    	boolean [] result = new boolean[4];
    	Arrays.fill(result, true);
    	
    	String condStr = Integer.toString(condition);
    	int index9 = condStr.indexOf('9');
    	
    	if(index9 == 0 || index9 == 1 || index9 == 2 ){
    		result[UP] = false;
    	}
    	if(index9 == 2 || index9 == 5 || index9 == 8){
    		result[RIGHT] = false;
    	}
    	if(index9 == 6 || index9 == 7 || index9 == 8){
    		result[DOWN] = false;
    	}
    	if(index9 == 0 || index9 == 3 || index9 == 6){
    		result[LEFT] = false;
    	}
    	
    	return result;
    }
 
}