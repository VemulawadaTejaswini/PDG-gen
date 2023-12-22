
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class Main{
	static int n;
	static int k;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.valueOf(br.readLine());
		int rem=n%1000;
		if(rem!=0)
			rem=1000-rem;
		System.out.println(rem);
	}

}
