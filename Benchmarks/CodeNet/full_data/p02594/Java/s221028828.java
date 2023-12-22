import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(buffer.readLine());
        if (n>=30)
            sb.append("Yes\n");
        else
            sb.append("No\n");
        System.out.println(sb);
    }
}
