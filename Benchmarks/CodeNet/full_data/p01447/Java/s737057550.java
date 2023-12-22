import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
	int n=x.nextInt();
	int cnt=0;
	n--;
	while(n>0) {
	    n/=3;
	    cnt++;
	}
	System.out.println(cnt);
    }
}
