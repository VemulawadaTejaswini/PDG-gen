import java.io.*;
import java.util.*;
 
 
class Main
{
    public static void main(String[] args)
    {
        int s,t,x,y=0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        s = a + b;
        t = a -b;
        x = a * b;
        if(b != 0){
        y = a / b;
        }
        int[] array = {s,t,x,y};
        Arrays.sort(array);
        System.out.println(array[3]);
        scanner.close();
    }
}