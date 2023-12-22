import java.util.*;
import java.io.*;
public class MyClass extends PrintWriter {
    MyClass()
    {
        super(System.out);
    }
    public static void main(String args[]) {
      MyClass o=new MyClass();
      o.main();
      o.flush();
      o.close();
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x==30)
        println("Yes");
        else
        println("No");
        sc.close();
    }
}