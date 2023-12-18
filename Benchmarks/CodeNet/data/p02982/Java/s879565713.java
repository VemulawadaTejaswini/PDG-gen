import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        ArrayList<ArrayList<Double>> li = new ArrayList<ArrayList<Double>>();
        for(int i = 0; i < n; i++){
            ArrayList<Double> tmp = new ArrayList<Double>();
            for(int j = 0; j < d; j++){
                double x = sc.nextDouble();
                tmp.add(x);
            }
            li.add(tmp);
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                double tmp = 0;
                for(int k = 0; k < d; k++){
                    tmp += Math.pow(li.get(i).get(k)-li.get(j).get(k),2);
                }
                if(Math.pow(tmp,0.5) % 1 == 0){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}