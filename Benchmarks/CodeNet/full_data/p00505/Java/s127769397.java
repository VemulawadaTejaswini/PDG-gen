import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[3];
        int countNormal = 0;
        int countRight = 0;
        int countAcute = 0;
        int countObtuse = 0;
        while(true){
            for(int i = 0; i < 3; i++){
                numbers[i] = sc.nextInt();
            }
            Arrays.sort(numbers);
            if(numbers[0] + numbers[1] <= numbers[2]){
                break;
            }else{
                countNormal++;
                if(numbers[0] * numbers[0] + numbers[1] * numbers[1] == numbers[2] * numbers[2]){
                    countRight++;
                }else if(numbers[0] * numbers[0] + numbers[1] * numbers[1] < numbers[2] * numbers[2]){
                    countObtuse++;
                }else{
                    countAcute++;
                }
            }
         }
        System.out.println(countNormal + " " + countRight + " " +countAcute + " " + countObtuse);
    }
}
