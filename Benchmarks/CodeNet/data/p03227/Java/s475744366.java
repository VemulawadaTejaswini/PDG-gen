import java.util.Scanner;

public class Main{

public static void main (String[] args){

Main main = new Main();
main.solve();

}

private void solve(){

Scanner sc = new Scanner (System.in);

String s = sc.next();

if (s.length()==2){
System.out.println(s);
} else {
System.out.print(s.charAt(2));
System.out.print(s.charAt(1));
System.out.println(s.charAt(0));
}
}
}