import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    public void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int half = n / 2;
        int max = 0;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            max += x;
            numList.add(x);
        }
        sc.close();
        ArrayList<Integer> nowList = (ArrayList<Integer>) numList.clone();
        Collections.sort(nowList);
        int minhalf = nowList.get((n / 2) - 1);
        int maxhalf = nowList.get(n / 2);
        for(int i = 0; i < numList.size(); i++){
            int now = numList.get(i);
            if(nowList.indexOf(now) < half){
                System.out.println(maxhalf);
            }else{
                System.out.println(minhalf);
            }
            
        }
        
    }

}