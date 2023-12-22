import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        
        int dummyNum = Integer.parseInt(tk.nextToken());
        int dummyNum2 = Integer.parseInt(tk.nextToken());
        
        Calc calc = (numInput,num2Input) -> {return numInput * num2Input;};
        System.out.print(calc.calcArea(dummyNum,dummyNum2));
        
        Calc2 calc2 = (numInput,num2Input) -> {return 2*(numInput + num2Input);};
        System.out.println(" "+calc2.calcSquereLength(dummyNum,dummyNum2));
    }
}

interface Calc{
    int calcArea(int num1, int num2);
}
interface Calc2{
    int calcSquereLength(int num1, int num2);
}
