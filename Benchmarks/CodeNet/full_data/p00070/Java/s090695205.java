import java.util.Scanner;

class Main {
    private static int _terminal = 0;
    private static int _numConsist = 0;
    private static int[] _integerArray = {0,1,2,3,4,5,6,7,8,9};

    public void nextFor(int iteration, int[] integerArray, int constant, int sum){

        for( int i = 0; i <integerArray.length; i++){
            sum += integerArray[i] * (constant + 1);
            int[] tmpIntegerArray = integerArray(integerArray, integerArray[i]);
            if(sum >= _terminal && (iteration > 1 || tmpIntegerArray.length > 0)){
                i = integerArray.length;
            } else {
                if (tmpIntegerArray.length != 0 && iteration > 1)
                    nextFor(iteration -1, tmpIntegerArray, constant + 1, sum);
                if((iteration == 1 && sum == _terminal) || (tmpIntegerArray.length == 0 && sum == _terminal)){
                    _numConsist++;
                }
            }
        }
    }

    public int[] integerArray(int[] formerArray, int delNo){
    	int[] currentArray = new int[formerArray.length - 1];

    	int iCurrent = 0;
    	for(int iFormer = 0; iFormer < formerArray.length; iFormer++){
    		if(formerArray[iFormer] != delNo){
    			currentArray[iCurrent] = formerArray[iFormer];
    			iCurrent++;
    		}
    	}
    	return currentArray;
    }

    public static void main(String[] args){

        Main cNS = new Main();

        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int iteration = input.nextInt();
            _terminal = input.nextInt();

            if(iteration >= 1 && iteration <=10 && _terminal >= 0 && _terminal <= 330){
                _numConsist = 0;
                cNS.nextFor(iteration, _integerArray, 0, 0);
                System.out.println(_numConsist);
            } else if(iteration >= 1 && iteration <=10 && _terminal > 330 && _terminal <= 10000){
                System.out.println(0);
            }

        }
        input.close();
    }
}