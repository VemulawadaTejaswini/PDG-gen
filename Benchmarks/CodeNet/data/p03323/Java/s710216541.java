import java.util.*;
public class Main{
public static void Main (String[] args){

Scanner scan = new Scanner (System.in);
int a = scan.nextInt();
int b = scan.nextInt();

if (a>8 || b>8){
System.out.print(": (");
} else {
System.out.print("Yay!");
}

}
}