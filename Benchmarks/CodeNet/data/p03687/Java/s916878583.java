import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        String inputS = scan.next();
        int answer = 1;
        for(int i = 1; i < inputS.length(); i++){
            if(inputS.charAt(0) == inputS.charAt(i)){
                answer++;
            }
        }
        if(answer == inputS.length()){
            System.out.println(0);
            return;
        }
        
        // search
        int min = Integer.MAX_VALUE;
        char temp = 'a';
        while(true){
            char[] input = inputS.toCharArray();
            int count = 0;
            while(true){
                boolean flag = true;
                for(int i = 0; i < input.length - count - 1; i++){
                    if(input[i] == temp || input[i+1] == temp){
                        input[i] = temp;
                    } else {
                        flag = false;
                    }
                }
                count++;
                if(flag){
                    break;
                }
                
            }

            if(count < min){
                min = count;
            }
            if(temp == 'z'){
                break;
            }
            temp++;

        }

        // answer
        System.out.println(min);

    }
}