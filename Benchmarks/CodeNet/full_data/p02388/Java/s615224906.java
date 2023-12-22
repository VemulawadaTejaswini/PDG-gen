import java.io.*;
class Main{
    public static void main(String[] args){
        BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in), 1);
        int intInputData = parseInt(r.readLine());
        int intResult = intInputData^3;
        System.out.println(""+intResult);
    }
}
