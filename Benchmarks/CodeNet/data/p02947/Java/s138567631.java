import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] arr = new String[num];
        
        for (int i = 0;i < num;i++){
            arr[i] = in.next();
            char[] chars = arr[i].toCharArray();
            Arrays.sort(chars);
            arr[i] = new String(chars);
            //System.out.println(arr[i]);
        }
               


        int count = 0;
        for (int i = 0;i < num - 1;i++){
            for (int j = i + 1;j < num;j++){
                //System.out.println(newStr1+ " " + newStr2);
                if (arr[i].equals(arr[j] )){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
