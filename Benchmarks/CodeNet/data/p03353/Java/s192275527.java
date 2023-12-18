import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] a = new String[s.length()];
        List<String> b = new ArrayList<String>();
        List<String> c = new ArrayList<String>();

        int count =0;
        for(int i =0; i< 6;i++ ){
            for(int k= i; k<= i+6; k++){
                b.add(s.substring(i,k));

                count++;
            }
        }

        Collections.sort(b);
        c.add(b.get(0));

        for(int j =0; j < b.size()-1; j++){
                c.add(b.get(j+1));

        }
        System.out.println(c.get(sc.nextInt()));



    }

}