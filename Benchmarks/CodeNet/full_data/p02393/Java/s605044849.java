import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int firstInputNumber  = scan.nextInt();
        int secondInputNumber = scan.nextInt();
        int thirdInputNumber  = scan.nextInt();
        
        List<Integer> minList = new ArrayList<Integer>(Arrays.asList(firstInputNumber, secondInputNumber, thirdInputNumber));
        
        Collections.sort(minList);
        for(int listCount = 0; listCount < minList.size(); listCount++){
            if(listCount == minList.size()-1){
                System.out.println(minList.get(listCount));
                break;
            }
            System.out.print(minList.get(listCount) + " ");
        }
    }
}
