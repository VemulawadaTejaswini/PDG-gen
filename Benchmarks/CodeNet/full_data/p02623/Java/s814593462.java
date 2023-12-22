import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] noOfBooks, timeTakenA, timeTakenB;
    static int timeResult = 0;
    static int countA, countB;
    static long maxNum;
    static String[] input;
    public static void main(String[] args) throws Exception {

        input = br.readLine().split(" ");
        noOfBooks = parser(input);

        input = br.readLine().split(" ");
        timeTakenA = parser(input);
        
        input = br.readLine().split(" ");
        timeTakenB = parser(input);
        
        for (int i = 0; i <noOfBooks[0]; i++){
            if (timeResult + timeTakenA[i]> noOfBooks[2]) break;
            timeResult += timeTakenA[i];
            countA++;
        }

        maxNum = countA;
        for (int i = 0; i <noOfBooks[1]; i++){
            while(timeResult + timeTakenB[i] > noOfBooks[2]){
                if(countA == 0) break;
                timeResult -= timeTakenA[countA - 1];
                countA--;
            }
            
            if(timeResult + timeTakenB[i] > noOfBooks[2]){
                break;
            }

            timeResult += timeTakenB[i];
            countB++;
            
            if(countA + countB >= maxNum){
                maxNum = countA + countB;
            }
        }
        
        System.out.println(maxNum);

    }

    public static int[] parser(String[] input){
        int i = 0;
        int[] output= new int[input.length];
        for(String str : input){
            output[i] = Integer.parseInt(str);
            System.out.println(output[i]);
            i++;

        }

        return output;
    }

}