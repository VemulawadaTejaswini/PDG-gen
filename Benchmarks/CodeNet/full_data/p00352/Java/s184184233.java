import java.io.*;
import java.util.*;

class Main{
private void compute(){
Scanner scanner = new Scanner(System.in);

int a=scanner.nextInt();
int b=scanner.nextInt();
System.out.println((a+b)/2);
}

public static void main(String a[]){
new Main().compute();
}
}