import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> list = Arrays.asList(sc.next().split(""));
        boolean flag = true;
        for(int i=0; i<list.size(); i++){
            String back = list.get(list.size()-1-i);
            if(!back.equals(list.get(i))){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            if(i == array.length){
                System.out.println(array[i]);
            } else {
                System.out.print(String.format("%d ", array[i]));
            }
        }
    }
}
