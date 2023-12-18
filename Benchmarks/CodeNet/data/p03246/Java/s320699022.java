

import java.util.*;

public class question01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        AbstractMap.SimpleEntry<Integer, Integer> a1 = new AbstractMap.SimpleEntry<>(0, 0);
        AbstractMap.SimpleEntry<Integer, Integer> b1 = new AbstractMap.SimpleEntry<>(0, 0);
        AbstractMap.SimpleEntry<Integer, Integer> a2 = new AbstractMap.SimpleEntry<>(0, 0);
        AbstractMap.SimpleEntry<Integer, Integer> b2 = new AbstractMap.SimpleEntry<>(0, 0);
        for( int i=1; i<= num; i++ ) {
            int val = sc.nextInt();
            if( i%4 == 0 ) {
                if( b1.getKey() == val ) {
                    b1 = new AbstractMap.SimpleEntry<>(val, b1.getValue()+1);
                } else {
                    b2 = new AbstractMap.SimpleEntry<>(val, 1);
                }
                continue;
            }
            if( i%3 == 0 && i%6 != 0 ) {
                if( a1.getKey() == val ) {
                    a1 = new AbstractMap.SimpleEntry<>(val, a1.getValue()+1);
                } else {
                    a2 = new AbstractMap.SimpleEntry<>(val, 1);
                }
                continue;
            }
            if( i%2 == 0 ) {
                if( b2.getKey() == val ) {
                    b2 = new AbstractMap.SimpleEntry<>(val, b2.getValue()+1);
                } else {
                    b1 = new AbstractMap.SimpleEntry<>(val, 1);
                }
                continue;
            }
            if( i%1 == 0 ) {
                if( a2.getKey() == val ) {
                    a2 = new AbstractMap.SimpleEntry<>(val, a2.getValue()+1);
                } else {
                    a1 = new AbstractMap.SimpleEntry<>(val, 1);
                }
                continue;
            }
        }
        int a = 0, b = 0;
        if( a2.getValue() != 0 ) {
            a = (a1.getValue() > a2.getValue()) ? a1.getValue() : a2.getValue();
            if( a< 0 ) a *= -1;
            a = (num / 2) - a;
        }
        if( b2.getValue() != 0 ) {
            b = (b1.getValue() > b2.getValue()) ? b1.getValue() : b2.getValue();
            if( b< 0 ) b *= -1;
            b = (num / 2) - b;
        }
        int result = a + b;
        if( result == 0 && a1.getKey() == b1.getKey() ) result = num / 2;

        System.out.println( result );
    }
}