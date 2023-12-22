import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//        long[] emp = new long[4001];
            

//        BufferedReader bReader =
//                new BufferedReader(new InputStreamReader(System.in));
        Scanner s = new Scanner(System.in); 

//        aryClear(emp);
        int empValue;
        while ((empValue = s.nextInt()) != 0) {
        	int overCount = 0, empID, n, price, quantitiy;
        	long total;

        	HashMap<Integer,Long> emp = new HashMap<Integer,Long>();
        	Queue<Integer> iQueue = new LinkedList<Integer>();

            n = 0;
            while (n < empValue) {
//                String str = bReader.readLine();
//                String[] editedstr = str.split(" ");
                empID = s.nextInt(); //Integer.parseInt(editedstr[0]);         //社員番号
                price = s.nextInt(); //Integer.parseInt(editedstr[1]);         //単価
                quantitiy = s.nextInt(); //Integer.parseInt(editedstr[2]);     //販売個数
                total = price * quantitiy;                      //実績

                if (!emp.containsKey(empID)) {                         //初めての入力
                    emp.put(empID, total);
                    iQueue.offer(empID);
                } else if (emp.get(empID) <= 1000000) {   //2回目以降の入力かつ100万を超えない値の場合
                    emp.put(empID, emp.get(empID) + total);
                    
                } else {
                }
                n++;
            }

//            for (int a : iQueue) {
            Integer a;
            while ((a = iQueue.poll()) != null) {
                //System.out.println(a);        //debug
                if (emp.get(a) >= 1000000) {
                    System.out.println(a);
                    overCount++;
                }
            }
            if (overCount == 0) {
                System.out.println("NA");
            }
            overCount = 0;
            iQueue.clear();
//            emp = new long[4001];
//            aryClear(emp);
            emp.clear();
        }
    }

    public static void aryClear(long[] ary) {
        for (int i = 0; i <= 4000; i++) {
            ary[i] = -1;
        }
    }
}