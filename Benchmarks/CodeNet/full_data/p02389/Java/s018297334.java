import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in), 1);
        String is = r.readLine();
        if(!is.contains(" "))
        	return;
        String[] sp = is.split(" ");
        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[1]);
        int area = a*b;
        int round = a*2+b*2;
        System.out.println(area + " " + round);
    }
}