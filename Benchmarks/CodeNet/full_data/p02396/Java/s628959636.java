import java.util.Scanner;
import java.util.ArrayList;

public class Main{

public static void main(String[] args) {

Scanner inp = new Scanner(System.in);
ArrayList array = new ArrayList();

int a = 1;

while (a!=0) {
a = inp.nextInt();
array.add(a);
}

for(int i = 0; i<array.size(); i++) {
System.out.println("Case "+(i+1)+": "+array.get(i));
}

}
}
