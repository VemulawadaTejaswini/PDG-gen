package com.company;

import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
String N=scan.next();
if(N.substring(N.length()-1,N.length()).equals("s")){System.out.println(N+"es");}
else{System.out.println(N+"s");}
    }
}

