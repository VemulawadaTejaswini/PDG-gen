import java.util.Scanner;
public class Main{
public static void main (String [] args) {
int win =0;
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
for(int j=0; j<s.length();j++) {
if( s.charAt(j) == 'o')
win++; 
}
if(15-s.length()+win >= 8) 
System.out.print("YES");
else
System.out.print("NO");
}
}