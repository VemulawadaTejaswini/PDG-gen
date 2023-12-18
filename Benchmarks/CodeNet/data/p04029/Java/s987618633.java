/**
 * Created by abhishek on 8/4/2016.
 */
import java.util.*;
import java.io.*;
public class C {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n*(n + 1)/2);
    }
}
