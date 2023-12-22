import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0; i < count ; i++){
            list1.add(sc.nextInt());
        }
        int max = list1.get(0);
        int min = list1.get(0);
        int sum = 0;
        for(int i = 0; i < count; i++ ){
            if(list1.get(i)>max)
                max = list1.get(i);
            if(list1.get(i)<min)
                min = list1.get(i);
            sum += list1.get(i);
        }
        System.out.println(min+" "+max+" "+sum);
    }
}