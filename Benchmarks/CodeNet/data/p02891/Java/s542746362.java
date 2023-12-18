import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        GetInput getInput = new GetInput();
        StringBuilder stringBuilder = getInput.getInputString();
        int n = getInput.getInt();
        long count = 0;
        for (int i = 0 ; i < stringBuilder.length()-1 ; i ++){
            if (stringBuilder.charAt(i) == stringBuilder.charAt(i+1)){
                count++;
                i++;
            }
        }
        System.out.println(count*n);
    }
}

class GetInput{
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int [] getArrayInt(){
        String []string;
        int []array;
        try {
            string = bufferedReader.readLine().split("\\s+");
            array  = new int[string.length];
            for (int i = 0; i < string.length; i++) {
                array[i] = Integer.parseInt(string[i]);
            }
            return array;
        } catch (IOException e) {
            e.printStackTrace();
        }

        int []arra = new int[2];
        return arra;
    }

    int getInt(){
        try {
            String string = bufferedReader.readLine();
            return Integer.parseInt(string);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    StringBuilder getInputString(){
        try {
            StringBuilder string = new StringBuilder();
            string.append(bufferedReader.readLine());
            return string;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new StringBuilder();
    }
}