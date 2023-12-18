import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = scan.nextInt();
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<n; i++){
            
            while(true){
                if(array[i-1] < 0 && array[i-1] > array[i]){
                    array[i-1] += array[i];
                    list.add((i+1) + " " + i);
                }else if(array[i-1] > array[i]){
                    array[i] += array[i-1];
                    list.add(i + " " + (i+1));
                }else{
                    break;
                }
            }
        }
        
        scan.close();
        System.out.println(list.size());
        for(String s : list){
            System.out.println(s);
        }
    }
}