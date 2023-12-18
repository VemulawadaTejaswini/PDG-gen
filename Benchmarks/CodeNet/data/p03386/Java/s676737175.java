import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Set<Integer> num=new HashSet<>();
int a=Integer.parseInt(sc.next());
int b=Integer.parseInt(sc.next());
int k=Integer.parseInt(sc.next());
int i=0;
while(i<k&&i<=b){
num.add(i+a);
i++;
}
int j=k-1;
while(j>=0&&a<=b-j){
num.add(b-j);
j--;
}
for(int l:num){
System.out.println(l);
}
}}