import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        ArrayList<Long> x = new ArrayList<Long>();
        ArrayList<Long> x2 = new ArrayList<Long>();

        for(int i=0;i<n;i++){
            long t = scan.nextLong();
            x.add(t);
            x2.add(t);
        }
        Collections.sort(x2);

        for(int i=0;i<n;i++){
            int index = x2.indexOf(x.get(i));
            x2.remove(index);
            System.out.println(x2.get(x2.size()/2));
            x2.add(index,x.get(i));
        }
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
    }


}