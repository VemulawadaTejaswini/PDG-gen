import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        int l = scanIn.nextInt();
        int n = scanIn.nextInt();

        List <String> array = new ArrayList<String>();
        String[] stringArray = new String[l];

        for(int i = 0; i < n; i++){
            stringArray[i] = scanIn.next();
            if(stringArray[i].length() == n){
                array.add(stringArray[i]);
            }
            continue;
        }

        Collections.sort(array);
        for(String string : array){
            System.out.print(string);
        }
    }
}

