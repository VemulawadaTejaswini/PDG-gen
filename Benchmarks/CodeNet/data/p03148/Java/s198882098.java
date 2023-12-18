import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    static double sushi[];
    static int sushiType[];
    static ArrayList<Integer> list;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sushi = new double[n];
        sushiType = new int[n];
        for(int i = 0; i < n; i++) {
            sushiType[i] = sc.nextInt();
            sushi[i] = sc.nextDouble();
        }
        list = new ArrayList();
        for(int i = 0; i < sushi.length; i++ ){
            chooseSushi(i,k - 2,i);
        }
        double max = 0;
        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            double temp = calcSushi(list.get(i),k);
            if(temp > max){
                max = temp;
            }
        }
        String ans = BigDecimal.valueOf(max).toPlainString();
        System.out.println(String.valueOf(ans));



    }

    private static void chooseSushi(int index,int rest,int log) {

        if(rest > 0){
            for(int i = index + 1; i < sushi.length - rest; i++ ){
                chooseSushi(i,rest - 1,log * 10 + i);
            }
        }else{
            for(int i = index + 1; i < sushi.length - rest; i++ ){
                list.add(log * 10 + i);
            }
        }
        //return 0;

    }

    private static double calcSushi(int num, int k){
        double total = 0;
        ArrayList<Integer> type = new ArrayList<>();
        //String address[] = String.valueOf(num).split("");
        String address[] = new String[k];
        if(String.valueOf(num).length() < k){
            address = String.valueOf(num*10).split("");
        }else{
            address = String.valueOf(num*10).split("");
        }
        for(int i = 0; i < k; i++){
            total += sushi[Integer.parseInt(address[i])];
            if(type.indexOf(sushiType[Integer.parseInt(address[i])]) == -1){
                type.add(sushiType[Integer.parseInt(address[i])]);
            }
        }
        total += type.size() * type.size();
        return total;

    }



}