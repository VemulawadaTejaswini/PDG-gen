import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Deque<Integer> d=new LinkedList<Integer>();
while(sc.hasNextInt()){
int n=sc.nextInt();
if(n==0){
System.out.println(d.pollFirst());
}
else{
d.offerFirst(n);
}
}
}
}