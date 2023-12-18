import java.util.*;
import java.io.*;

public class Main{
  	public static void main(String[] args) /*throws IOException*/{
      	Scanner scan=new Scanner();
      	int N=scan.nextInt();
      	long ans=(long)N*(N-1);
      	ans>>=1;
      	System.out.println(ans);
    }
}