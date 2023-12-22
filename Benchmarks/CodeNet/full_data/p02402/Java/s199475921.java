import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            array.add(num);
        }
        int min = array.get(0);
        int max = array.get(0);
        long sum = 0;
        for(int j=0; j < array.size();j++){
            if(array.get(j) < min){
                min = array.get(j);
            }
            if(array.get(j) > max){
                max = array.get(j);
            }
            sum += array.get(j);
        }
        System.out.println(min + " " + max + " " + sum);
    }
}

