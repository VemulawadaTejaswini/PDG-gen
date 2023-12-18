import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valueKodomo = scanner.nextInt();
        int valueOkasi = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < valueKodomo;i++){
            list.add(scanner.nextInt());
        }
        Arrays.sort(list.toArray());
        int returnValue = 0;
        for(Integer integer : list){
            if(valueOkasi == integer){
               returnValue++;
               break;
            }else{
                if(valueOkasi > integer){
                    returnValue++;
                }
            }
        }
        System.out.println(returnValue);
    }
}