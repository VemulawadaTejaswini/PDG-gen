import java.util.Scanner;
import java.util.Comparator;

public class Main{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
String[] s=new String[n];
for(int i=0; i<s.length; i++){
s[i]=sc.next();}

for(int i=0; i<s.length-1; i++){
}
Arrays.sort(s);

for(int i=0; i<s.length; i++){
System.out.println(s[i]);}


}}