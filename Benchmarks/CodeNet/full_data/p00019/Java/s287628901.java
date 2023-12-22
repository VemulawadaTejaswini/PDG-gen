import java.io.*;
import java.util.*;
public class Main {public static void main(String[] args) {Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));int n=sc.nextInt();long p=1;for(int i=1;i<=n;i++)p*=i;System.out.println(p);}}