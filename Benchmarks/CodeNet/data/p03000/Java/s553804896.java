import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        
        int num = Integer.parseInt(line[0]);
        int limit = Integer.parseInt(line[1]);

        int[] arr = new int[num];
        line = sc.nextLine().split(" ");
        for(int i =0;i < line.length;i++){
            arr[i] = Integer.parseInt(line[i]);
        }


        int count = 0;
        int pos = 0;
        int index = 0;
        while(pos <= limit && index < arr.length){
            pos += arr[index];
            index++;
            count++;
        }

        System.out.println(count);
    }
}
