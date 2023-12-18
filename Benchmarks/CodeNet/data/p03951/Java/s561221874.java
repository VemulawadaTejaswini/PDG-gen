import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int num = scan.nextInt();
        char[] input1 = scan.next().toCharArray();
        char[] input2 = scan.next().toCharArray();
        
        // search
        int count = 0;
        int max = 0;
        for(int i = 0; i < num; i++){
            for(int j = 0; i + j < num; j++){
                if(input1[i+j] == input2[j]){
                    count++;
                } else {
                    break;
                }
            }
            if(count > max){
                max = count;
            }
            count = 0;
        }

        // answer
        System.out.println(num * 2 - max);
    }
}