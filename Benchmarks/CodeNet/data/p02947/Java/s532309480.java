import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] arr = new String[num];
        for (int i = 0;i < num;i++){
            arr[i] = in.next();
            //System.out.println(arr[i]);
        }
        
        int count = 0;
        for (int i = 0;i < num - 1;i++){
            char[] chars1 = arr[i].toCharArray();
            Arrays.sort(chars1);
            String newStr1 = new String(chars1);
            for (int j = i + 1;j < num;j++){
                char[] chars2 = arr[j].toCharArray();
                Arrays.sort(chars2);
                String newStr2 = new String(chars2);
                //System.out.println(newStr1+ " " + newStr2);
                if (newStr1.equals(newStr2)){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
