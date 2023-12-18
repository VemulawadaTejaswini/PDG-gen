import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer N = scan.nextInt();
        Integer M = scan.nextInt();
        ArrayList<Long> array = new ArrayList<Long>();

        for(int i=0;i<N;i++)
            array.add(scan.nextLong());

        Collections.sort(array,Comparator.reverseOrder());

        ArrayList<Long> array2 = new ArrayList<Long>();
        for(int i=0;i<2*M;i++){
            if(array.size() != 0){
                array2.add(array.get(0));
                array.remove(0);
            }
        }

        for(int i=0;i<M;i++){
            Collections.sort(array2,Comparator.reverseOrder());
            long a = array2.get(0);
            array2.remove(0);
            array2.add(0,a/2);
        }

        long sum = 0;
        for(int i=0;i<array2.size();i++){
            sum += array2.get(i);
        }

        for(int i=0;i<array.size();i++){
            sum += array.get(i);
        }
        

        System.out.println(sum);
    }
}
