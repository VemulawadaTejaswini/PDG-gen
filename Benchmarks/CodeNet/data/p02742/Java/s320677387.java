/*
int a[] = new int[n];
String line = br.readLine(); // to read multiple integers line
String[] strs = line.trim().split("\\s+");
for (int i = 0; i < n; i++) {
    a[i] = Integer.parseInt(strs[i]);
}*/

/*
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int arr[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
*/



import java.util.*;
import java.io.*;
public class Main {
    public static void main (String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long a[] = Arrays.stream(in.readLine().split(" ")).mapToLong(Long::parseLong).toArray();


        if(a[0] == 1 || a[1] == 1) {
            System.out.println(1);
        }
        else{
            System.out.println((a[0]*a[1] + 1)/2);
        }
    }
}