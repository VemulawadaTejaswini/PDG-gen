import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i=0;i<n;i++)
            array.add(scan.nextInt());

        int min = array.get(0);
        int count = 0;
        for(int i=0;i<n;i++){
            if(array.get(i) < min){
                min = array.get(i);
                count++;
            }
        }

        System.out.println(count+1);
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
      }
}
