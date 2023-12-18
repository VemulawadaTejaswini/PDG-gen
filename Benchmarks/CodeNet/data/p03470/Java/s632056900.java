import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
HashSet<Integer> U=new HashSet<>();
int n=Integer.parseInt(sc.next());
for(int i=0;i<n;i++){
U.add(Integer.parseInt(sc.next()));
}
System.out.println(U.size());
}}