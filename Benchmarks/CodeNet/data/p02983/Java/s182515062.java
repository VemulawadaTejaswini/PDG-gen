import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int l = Integer.parseInt(sc.next());
	int r = Integer.parseInt(sc.next());
	if((r - l) > 2018){
		System.out.println(0);
	}else{
		System.out.println((l*(l+1))%2019);
	}
}
}
