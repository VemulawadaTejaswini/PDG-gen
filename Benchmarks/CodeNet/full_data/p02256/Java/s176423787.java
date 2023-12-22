import java.lang.Math.*;
import java.util.*;
import java.io.Console;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.*;
import java.math.*;

class test {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int a=cin.nextInt(),b=cin.nextInt();
		for(int i=(a<=b)?a:b;i>=1;i--){
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				System.exit(1);
			}
		}
	}
}
