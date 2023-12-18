package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

	BufferedReader br=
            new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	double num =Integer.parseInt(str);

	if(num%2==1){
		System.out.println(0);
	}
	else {
		double sum=0;
		for (int i = 1; i <=30; i++) {
			sum += Math.floor((num/(Math.pow(5,i))));
		}
		System.out.println(sum);
	}
    }
}