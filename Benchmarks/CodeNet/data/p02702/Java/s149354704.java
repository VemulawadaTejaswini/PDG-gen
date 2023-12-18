import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int len = str.length();
        char[] cha = str.toCharArray();
        ArrayList<Integer> al = new ArrayList<>();

        int num = 0;
        int[] rank = new int[len];

        for(int i=0; i<len; i++){
            String str_value = String.valueOf(cha[len-1-i]);
            int value = Integer.parseInt(str_value);
            if(i==0){
                rank[i] = 1;
            } else{
                rank[i] = (10*rank[i-1])%2019;
            }
            num = (num + value*rank[i])%2019;
            al.add(num);
        }

        int count = 0;

        for(int i=0; i<2019; i++){
            int n = 0;
            for(int j:al) {if(i==j) n++;}
            count += (n-1)*n/2;
        }

        

        System.out.println(count);
        sc.close();
    }
}