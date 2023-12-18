//package cf;

import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(System.in);
        int n = io.nextInt(), m = io.nextInt();
        int c = 0;
        for(int i = 0; i < n; i++)
            if(io.nextInt() >= 1/(4*m)) c++;
        System.out.println(c >= m ? "Yes" : "No");
    }
}


