import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Double> li = new ArrayList<>();
        double allv = 0;
        for(int i = 0; i < n; i++){
            double d = sc.nextDouble();
            li.add(d);
            allv += d;
        }
        Collections.sort(li, Comparator.reverseOrder());
        if(li.get(m-1) >= (allv/(4*m))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}