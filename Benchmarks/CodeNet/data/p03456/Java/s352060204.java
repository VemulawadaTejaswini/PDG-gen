package b;

import java.util.*;

public class Main{
	public static void main(String[] args){

    int a = 0;
    int b = 0;

    String result = String.valueOf(a) + String.valueOf(b);
    int resultInt = Integer.parseInt(result);
    double resultSqrt = Math.sqrt(resultInt) ;

    if(resultSqrt==Math.floor(resultSqrt)) {System.out.println("Yes");}
    else{System.out.println("No");}



    }
}