import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[3];
        int sum=0;

        for(int i = 0; i<3; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        sum = array[0]+array[1];
        System.out.println(sum);
    }

}